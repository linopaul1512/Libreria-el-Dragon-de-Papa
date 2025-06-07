package Model;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import View.View_Article;
import View.View_Client;
import View.View_Deparment;
import View.View_Deposit;
import View.View_Login;
import View.View_Sale;

public class Validate implements KeyListener{
	View_Client viewClient;
	View_Deparment viewDeparment;
	View_Login viewLogin;
	View_Sale viewSale;
	View_Article viewArticle;
	View_Deposit viewDeposit;
	
	Sale sale;
	
	public Validate(View_Article view) {
		viewArticle = view;
	}
	
	public Validate(View_Client view) {
		viewClient= view;
	}
	
	public Validate(View_Deparment view) {
		viewDeparment= view;
	}	
	
	public Validate(View_Login view) {
		viewLogin= view;
	}
	
	public Validate(View_Sale view) {
		viewSale = view;
	}

	public Validate(View_Deposit view) {
		viewDeposit = view;
	}	
	
	
	public Boolean ValidateEmptyClient() 
	{
		Boolean blanck = false;
		Boolean empty = false;
		Boolean ready = true;
		String sex;
		if (viewClient.getJradiobuttonsexmale().isSelected())
			sex = "Male";
		else
			sex = "Female";
		if ((viewClient.getJtextcode().getText().isEmpty()) || 
			(viewClient.getJtextname().getText().isEmpty()) ||
			viewClient.getJtextlastname().getText().isEmpty() ||
			sex.isEmpty()||

			viewClient.getJtextadress().getText().isEmpty()||
			viewClient.getJtextID().getText().isEmpty())
			empty=true;
		if ((viewClient.getJtextcode().getText().isBlank()) || 
				(viewClient.getJtextname().getText().isBlank()) ||
				viewClient.getJtextlastname().getText().isBlank() ||
				sex.isBlank()||
				viewClient.getJtextadress().getText().isBlank() ||
				viewClient.getJtextID().getText().isBlank())
				blanck=true;
		if (empty || blanck)
			ready=false;
		return ready;
	}
	
	public Boolean ValidateEmptyDeparment() 
	{
		Boolean blanck = false;
		Boolean empty = false;
		Boolean ready = true;
		
		if ((viewDeparment.getJtextcodedep().getText().isEmpty()) || 
			(viewDeparment.getJtextname().getText().isEmpty()) ||
			viewDeparment.getJtexttype().getText().isEmpty())
			empty=true;
		if ((viewDeparment.getJtextcodedep().getText().isBlank()) || 
				(viewDeparment.getJtextname().getText().isBlank()) ||
				viewDeparment.getJtexttype().getText().isBlank())
				blanck=true;
		if (empty || blanck)
			ready=false;
		return ready;
	}
	
	public Boolean ValidateEmptyDeposit() 
	{
		Boolean blanck = false;
		Boolean empty = false;
		Boolean ready = true;
		String type;
		
		if (viewDeposit.getJradiobuttonMayor().isSelected())
			type = "Mayor";
		else
			type = "Detal";
		
		if ((viewDeposit.getJtextcod().getText().isEmpty()) || 
			(viewDeposit.getJtextname().getText().isEmpty()) ||
			type.isEmpty()) 
			empty=true;
		if ((viewDeposit.getJtextcod().getText().isBlank()) || 
				(viewDeposit.getJtextname().getText().isBlank()) ||
				type.isEmpty())
				blanck=true;
		if (empty || blanck)
			ready=false;
		return ready;
	}
	
	
	public Boolean ValidateEmptySale() 
	{
		Boolean blanck = false;
		Boolean empty = false;
		Boolean ready = true;
		String type;
		
		if (viewSale.getJradiobuttonMayor().isSelected())
			type = "Mayor";
		else
			type = "Detal";
		
		if ((viewSale.getJtextcodesale().getText().isEmpty()) || 
			(viewSale.getJtextcodedetailsale().getText().isEmpty() ||
			viewSale.getJtextcodeclient().getText().isEmpty()) ||
			viewSale.getJtextnameclient().getText().isEmpty() ||
			viewSale.getJtextdate().getText().isEmpty() ||
			viewSale.getJtextcodearticle().getText().isEmpty() ||
			viewSale.getJtextnamearticle().getText().isEmpty() ||
			viewSale.getJtextcodedeposit().getText().isEmpty() ||
			type.isEmpty() ||
			viewSale.getJtextquantity().getText().isEmpty() ||
			viewSale.getJtextiva().getText().isEmpty() ||
			viewSale.getJtextsubtotal().getText().isEmpty() ||
			viewSale.getJtexttotal().getText().isEmpty()
			)
			empty=true;
		if ((viewSale.getJtextcodesale().getText().isBlank()) || 
				viewSale.getJtextcodedetailsale().getText().isBlank() ||
				viewSale.getJtextcodeclient().getText().isBlank() ||
				viewSale.getJtextnameclient().getText().isBlank() ||
				viewSale.getJtextdate().getText().isBlank() ||
				viewSale.getJtextcodearticle().getText().isBlank() ||
				viewSale.getJtextnamearticle().getText().isBlank() ||
				viewSale.getJtextcodedeposit().getText().isBlank() ||
				type.isBlank() ||
				viewSale.getJtextquantity().getText().isBlank() ||
				viewSale.getJtextiva().getText().isBlank()||
				viewSale.getJtextsubtotal().getText().isBlank() ||
				viewSale.getJtextiva().getText().isBlank())
				blanck=true;
		if (empty || blanck)
			ready=false;
		return ready;
	}
	
	public Boolean ValidateEmptLogin() 
	{
		Boolean blanck = false;
		Boolean empty = false;
		Boolean ready = true;
		
		
		
		if ((viewLogin.getJtextusername().getText().isEmpty()) || 
			viewLogin.getJtextusername().getText().isEmpty())
			empty=true;
		if ((viewLogin.getJtextpassword().getText().isBlank()) || 
				(viewLogin.getJtextpassword().getText().isBlank()))
				blanck=true;
		if (empty || blanck)
			ready=false;
		return ready;
	}

	
	
	@Override
	public void keyTyped(KeyEvent e) {
		int number;
		number =  e.getKeyChar();
		
		
		if(e.getSource().equals(viewClient.getJtextname()))
		{	
			if((number<65 || number>122)||(number>=90 && number<96))
				e.consume();
		}
		else if(e.getSource().equals(viewClient.getJtextlastname()))
			if((number<65 || number>122)||(number>=90 && number<96))
				e.consume();	
			
				
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int number;
		number =  e.getKeyChar();
		
		
		if(e.getSource().equals(viewDeparment.getJtextname()))
		{	
			if((number<65 || number>122)||(number>=90 && number<96))
				e.consume();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int number;
		number =  e.getKeyChar();
		
		if (e.getSource().equals(viewArticle.getJtextprice()))
		{
			if ((number <48) || (number >57))
				e.consume();
		}

	}
	
	public void keyReleasedSale(KeyEvent e) {
		int number;
		number =  e.getKeyChar();
		
		
		if(e.getSource().equals(viewSale.getJtextnameclient()))
		{	
			if((number<65 || number>122)||(number>=90 && number<96))
				e.consume();
		}
		else if(e.getSource().equals(viewSale.getJtextquantity()))
		{ 
			if ((number <=48) || (number >57))
				e.consume();
		}
	    else if (e.getSource().equals(viewSale.getJtextquantity()))
		{
	    	if ((number <=48) || (number >57))
				e.consume();
		}
	    else if (e.getSource().equals(viewSale.getJtextprice()))
		{
	    	if ((number <=48) || (number >57))
				e.consume();
		}
	    else if (e.getSource().equals(viewSale.getJtextnamearticle()))
		{
	    	if((number<65 || number>122)||(number>=90 && number<96))
			e.consume();
		}
	}

}
