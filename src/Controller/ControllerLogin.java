package Controller;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Login;
import Model.Model_Login;
import Model.Validate;
import View.View_Login;
import View.View_Menu;



public class ControllerLogin implements ActionListener{

	View_Login viewX;
	Login found;
	Model_Login model;
	View_Menu menuX;
	Validate validate;
	
	public ControllerLogin(View_Login view)
	{
		viewX= view;
		model = new Model_Login();
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		found= null;
	if (viewX.validate.ValidateEmptLogin())
	{	
		if(e.getActionCommand().equalsIgnoreCase("Enter"))
		{
			found = model.Enter(viewX.getJtextusername().getText(), 
								viewX.getJtextpassword().getText());
			if(found!= null)
			{
				JOptionPane.showMessageDialog(new JFrame(), "Found");
				Clean();
				
				menuX = new View_Menu("");
			}
			else
			
				
				JOptionPane.showMessageDialog(new JFrame(), "Not found");
				Clean();
			}
		
			
		}
			else
			{
				JOptionPane.showMessageDialog(new JFrame(), "Please fill in all the information and do not leave any blanks.");
				Clean();
			}
	}


	
		
	
	
	
		public void Clean() {
			viewX.getJtextusername().setText("");
			viewX.getJtextpassword().setText("");
		}
	
		
	
	
	
}
