package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Client;
import Model.Deparment;
import Model.Model_Client;
import Model.Model_Deparment;
import Model.Validate;
import View.View_Client;

public class ControllerClient implements ActionListener{

	View_Client viewX;
	Client found;
    Model_Client model;

    
    public ControllerClient(View_Client view) {
    	viewX = view;
        model = new Model_Client();
    }
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		found = null;
		String sex = "";
		if(e.getActionCommand().equalsIgnoreCase("Search"))
		{
			 found = model.Search(viewX.getJtextcode().getText());
			if((found != null) && (found.getStatus().equalsIgnoreCase("A")))
			{
				JOptionPane.showMessageDialog(new JFrame(), "Finded");
				viewX.getJtextcode().setText(found.getCodeClient());
				viewX.getJtextname().setText(found.getName());
				viewX.getJtextlastname().setText(found.getLastname());
				if(found.getSex().equals("Male"))
					viewX.getJradiobuttonsexmale().setSelected(true);
				else
					viewX.getJradiobuttonsexfemale().setSelected(true);
				viewX.getJtextadress().setText(found.getAdress());
				viewX.getJtextID().setText(found.getID());
			}
			else if((found != null)&& (found.getStatus().equalsIgnoreCase("I")))
			{
				int i = JOptionPane.showConfirmDialog(null, "The client is deactivated. Do you want to reactivate it?", "inactive", JOptionPane.YES_NO_OPTION);
				
				if(i == JOptionPane.YES_NO_OPTION)
				{
					model.Reactive(found.getCodeClient());
					JOptionPane.showMessageDialog(new JFrame(), "Client reactivated");
				}
					
			}
		}
		
		else
			if (viewX.validate.ValidateEmptyClient())
			{
				if(e.getActionCommand().equalsIgnoreCase("Include"))
				{
					if (viewX.getJradiobuttonsexmale().isSelected())
						sex = "Male";
					else
						sex = "Female";
					
						found = new Client(viewX.getJtextcode().getText(), 
													viewX.getJtextname().getText(), 
													viewX.getJtextlastname().getText(),
													sex,
													viewX.getJtextadress().getText(),
													viewX.getJtextID().getText(),
													"A"
													);
						if(model.Include(found))
						{
							JOptionPane.showMessageDialog(new JFrame(), "Client has been added.");
							Clean();
						}	
						else
						{
							JOptionPane.showMessageDialog(new JFrame()," The article has not been added.");
							Clean();
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
					Clean();
				}
				else
					if(e.getActionCommand().equalsIgnoreCase("Modify"))
					{
						if (viewX.getJradiobuttonsexmale().isSelected())
							sex = "Male";
						else
							sex = "Female";
						
							found = new Client(viewX.getJtextcode().getText(), 
														viewX.getJtextname().getText(), 
														viewX.getJtextlastname().getText(),
														sex,
														viewX.getJtextadress().getText(),
														viewX.getJtextID().getText(),
														"A");
							if(model.Modify(found))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Successfully Modified Client");
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The client could not be modified");
								Clean();
							}				
				      }
				else
					if(e.getActionCommand().equalsIgnoreCase("Delete"))
					{
						if (viewX.getJradiobuttonsexmale().isSelected())
							sex = "Male";
						else
							sex = "Female";
						
							found = new Client(viewX.getJtextcode().getText(), 
														viewX.getJtextname().getText(), 
														viewX.getJtextlastname().getText(),
														sex,
														viewX.getJtextadress().getText(),
														viewX.getJtextID().getText(),
														"A"
														);
							if(model.Delete(found.getCodeClient()))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Client successfully removed ");
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The client could not be modified");
								Clean();
							}				
					}
		}
	
		public void Clean() 
		{
			viewX.getJtextcode().setText("");
			viewX.getJtextname().setText("");	
			viewX.getJtextlastname().setText("");
			viewX.getJradiobuttonsexmale().setSelected(false);
			viewX.getJradiobuttonsexfemale().setSelected(false);	
			viewX.getJtextadress().setText("");						
			viewX.getJtextID().setText("");
		}

		
	}


