package Controller;

import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.View_Article;
import View.View_Client;
import View.View_Deparment;
import View.View_Deposit;
import View.View_Menu;
import View.View_Sale;

public class ControllerMenu implements ActionListener{

	View_Menu viewX;
	View_Client client;
	Menu menu;
	View_Deparment deparment;
	View_Article article;
	View_Deposit deposit;
	View_Sale sale;


	public ControllerMenu(View_Menu listener) {
		viewX= listener;
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equalsIgnoreCase("Client")) {
			client = new View_Client("");
		}
		else
			if(e.getActionCommand().equalsIgnoreCase("Deparment")) {
				deparment = new View_Deparment("");
			}
			else
				if(e.getActionCommand().equalsIgnoreCase("Article")) {
					 article = new View_Article("");
				}
				 else
					if(e.getActionCommand().equalsIgnoreCase("Deposit")) {
						deposit = new View_Deposit("");
					}
					else
						if(e.getActionCommand().equalsIgnoreCase("Sale")) {
						sale = new View_Sale("");
					}
						
					
	
		
		
		
		
		
		
		
	}

}
