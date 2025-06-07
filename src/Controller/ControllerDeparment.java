package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Client;
import Model.Deparment;
import Model.Model_Deparment;
import Model.Validate;
import View.View_Deparment;

public class ControllerDeparment implements ActionListener {
	View_Deparment viewX;
	Model_Deparment model;
	Deparment found;
	Validate validate;
	
	
	public ControllerDeparment(View_Deparment view) {
		viewX = view;
		model = new Model_Deparment();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		found = null;
		
		if(e.getActionCommand().equalsIgnoreCase("Search"))
		{
			 found = model.Search(viewX.getJtextcodedep().getText());
			if((found != null) &&(found.getStatus().equalsIgnoreCase("A")))
			{
				JOptionPane.showMessageDialog(new JFrame(), "Finded");
				viewX.getJtextcodedep().setText(found.getCodeDep());
				viewX.getJtextname().setText(found.getName());
				viewX.getJtexttype().setText(found.getType());
			}
			else if((found != null)&& (found.getStatus().equalsIgnoreCase("I")))
			{
				int i = JOptionPane.showConfirmDialog(null, "The deparment is deactivated. Do you want to reactivate it?", "inactive", JOptionPane.YES_NO_OPTION);
				
				if(i == JOptionPane.YES_NO_OPTION)
				{
					model.Reactive(found.getCodeDep());
					JOptionPane.showMessageDialog(new JFrame(), "Deparment reactivated");
				}
					
			}
			
			
		}
		else if  (viewX.validate.ValidateEmptyDeparment())
		{

			if(e.getActionCommand().equalsIgnoreCase("Include"))
				{
					found = new Deparment(viewX.getJtextcodedep().getText(), 
												viewX.getJtextname().getText(), 
												viewX.getJtexttype().getText(),
												"A");
					if(model.Include(found))
					{
						JOptionPane.showMessageDialog(new JFrame(), "Department has been added.");
						Clean();
					}	
					else
					{
						JOptionPane.showMessageDialog(new JFrame(), "The department has not been added.");
						Clean();
					}
				}	
					
			}
		{
			JOptionPane.showMessageDialog(new JFrame(), "Please fill in all the information and do not leave any blanks.");
			Clean();
		}
		
		
				if(e.getActionCommand().equalsIgnoreCase("Clean"))
				{
					Clean();
				}
				else
					if(e.getActionCommand().equalsIgnoreCase("Modify"))
					{
						
							found = new Deparment(viewX.getJtextcodedep().getText(), 
														viewX.getJtextname().getText(),
														viewX.getJtexttype().getText(),
														"A");
							if(model.Modify(found))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Successfully modified deparment");
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The deparment could not be modified");
								Clean();
							}				
					}
					else
						if(e.getActionCommand().equalsIgnoreCase("Delete"))
						{	
								found = new Deparment(viewX.getJtextcodedep().getText(), 
										viewX.getJtextname().getText(),
										viewX.getJtexttype().getText(),
										"A");
								if(model.Delete(found.getCodeDep()))
								{
									JOptionPane.showMessageDialog(new JFrame(), "Deparment successfully removed ");
									Clean();
								}	
								else
								{
									JOptionPane.showMessageDialog(new JFrame(), "The deparment could not be modified");
									Clean();
								}				
						}
		
		
			}
		public void Clean() {
			viewX.getJtextcodedep().setText("");
			viewX.getJtextname().setText("");
			viewX.getJtexttype().setText("");
		
	}
	

}
