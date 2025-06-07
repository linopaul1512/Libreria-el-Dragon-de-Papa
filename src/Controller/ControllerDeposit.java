package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.directory.SearchControls;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Deparment;
import Model.Deposit;
import Model.Model_Deposit;
import Model.Validate;
import View.View_Deposit;


public class ControllerDeposit implements ActionListener{

	
	View_Deposit viewX;
	Model_Deposit model;
	Deposit found;
	Validate validate;
	
	public ControllerDeposit(View_Deposit view) {
		viewX = view;
		model = new Model_Deposit();
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		found = null;
		
		if(e.getActionCommand().equalsIgnoreCase("Search"))
		{
			 found = model.Search(viewX.getJtextcod().getText());
			 
			if((found != null) &&(found.getStatus().equalsIgnoreCase("A")))
			{
				JOptionPane.showMessageDialog(new JFrame(), "Finded");
				viewX.getJtextcod().setText(found.getCode());
				viewX.getJtextcod().setEnabled(false);
				viewX.getJtextname().setText(found.getName());
				if(found.getType().equals("Mayor"))
					viewX.getJradiobuttonMayor().setSelected(true);
				else
					viewX.getJradiobuttonDetal().setSelected(true);
			}
			else if((found != null)&& (found.getStatus().equalsIgnoreCase("I")))
			{
				int i = JOptionPane.showConfirmDialog(null, "The deposit is deactivated. Do you want to reactivate it?", "inactive", JOptionPane.YES_NO_OPTION);
				
				if(i == JOptionPane.YES_NO_OPTION)
				{
					model.Reactive(found.getCode());
					JOptionPane.showMessageDialog(new JFrame(), "Deposit reactivated");
				}
					
			}
			
			
		}
		
		else if  (viewX.validate.ValidateEmptyDeposit())
		{	
			if(e.getActionCommand().equalsIgnoreCase("Include"))
			{
					String type;
					
					if (viewX.getJradiobuttonMayor().isSelected())
						type = "Mayor";
					else
						type = "Detal";
					
					found = new Deposit(viewX.getJtextcod().getText(), 
												viewX.getJtextname().getText(), 
												type,
												"A");
					if(model.Include(found))
					{
						JOptionPane.showMessageDialog(new JFrame(), "Deposit has been added.");
						viewX.getJtextcod().setEnabled(false);
						Clean();
						viewX.getJtextcod().setEnabled(true);
					}	
					else
					{
						JOptionPane.showMessageDialog(new JFrame(), "The deposit has not been added.");
						viewX.getJtextcod().setEnabled(false);
						Clean();
						viewX.getJtextcod().setEnabled(true);
					}
					
					
			}
			
		}
		else
		{
			JOptionPane.showMessageDialog(new JFrame(), "Please fill in all the information and do not leave any blanks.");
			Clean();
		}
				if(e.getActionCommand().equalsIgnoreCase("Clean"))
				{
					viewX.getJtextcod().setEnabled(true);
					Clean();
				}
				else
					if(e.getActionCommand().equalsIgnoreCase("Modify"))
					{
						String type;
						
						if (viewX.getJradiobuttonMayor().isSelected())
							type = "Mayor";
						else
							type = "Detal";
							found = new Deposit(viewX.getJtextcod().getText(), 
														viewX.getJtextname().getText(),
														type,
														"A");
							if(model.Modify(found))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Successfully modified deposit");
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The deposit could not be modified");
								Clean();
							}				
					}
					else
						if(e.getActionCommand().equalsIgnoreCase("Delete"))
						{	
							String type;
							
							if (viewX.getJradiobuttonMayor().isSelected())
								type = "Mayor";
							else
								type = "Detal";
							
								found = new Deposit(viewX.getJtextcod().getText(), 
										viewX.getJtextname().getText(),
										type,
										"A");
								if(model.Delete(found.getCode()))
								{
									JOptionPane.showMessageDialog(new JFrame(), "Deposit successfully removed ");
									
									viewX.getJtextcod().setEnabled(true);
									Clean();
									viewX.getJtextcod().setEnabled(true);
								}	
								else
								{
									JOptionPane.showMessageDialog(new JFrame(), "The deposit could not be modified");
									viewX.getJtextcod().setEnabled(true);
									Clean();
									viewX.getJtextcod().setEnabled(true);
								}				
						}
		
		
			}
		public void Clean() {
			viewX.getJtextcod().setText("");
			viewX.getJtextname().setText("");
			viewX.getJradiobuttonDetal().setSelected(false);
			viewX.getJradiobuttonMayor().setSelected(false);	
		
	}
		
	

}
