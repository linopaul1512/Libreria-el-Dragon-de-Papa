package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.cj.protocol.Resultset;

import Model.Article;
import Model.Client;
import Model.Deparment;
import Model.Model_Deparment;
import Model.Model_Sale;
import Model.Sale;
import View.View_Article;
import View.View_Sale;

public class ControllerSale implements ActionListener {

	
	double subtotal, total, result, iva, price;
	int quantity;
	
	View_Sale viewX;
	Model_Sale model;
	
	Sale found;
	Client client;
	Article article;
	View_Article viewA;
	

	 

	
	
	public ControllerSale(View_Sale view)	{
		viewX = view;
		model = new Model_Sale();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("Search"))
		{
		found = model.Search(viewX.getJtextcodesale().getText());
			{
				JOptionPane.showMessageDialog(new JFrame(), "Finded");
				viewX.getJtextcodesale().setText(found.getCodesale());
				viewX.getJtextcodesale().setEnabled(false);
				viewX.getJtextcodedetailsale().setText(found.getCodesale());
				viewX.getJtextcodedetailsale().setEnabled(false);
				viewX.getJtextcodeclient().setText(found.getCodeclient());
				viewX.getJtextcodeclient().setEnabled(false);
				viewX.getJtextnameclient().setText(found.getCustomerName());		
				viewX.getJtextdate().setText(found.getDate());
				viewX.getJtextcodearticle().setText(found.getCodesale());
				viewX.getJtextcodearticle().setEnabled(false);
				viewX.getJtextnamearticle().setText(found.getCodesale());
				viewX.getJtextcodedeposit().setText(found.getCodesale());
				viewX.getJtextcodedeposit().setEnabled(false);
				if(found.getTypeDeposit().equals("Mayor"))
					viewX.getJradiobuttonMayor().setSelected(true);
				else
					viewX.getJradiobuttonDetal().setSelected(true);
				viewX.getJtextquantity().setText(String.valueOf(found.getQuantity()));
				viewX.getJtextiva().setText(String.valueOf(found.getIVA()));
				viewX.getJtextsubtotal().setText(String.valueOf(found.getSubTotal()));
				viewX.getJtexttotal().setText(String.valueOf(found.getTotal()));
			}
			
					
		}
		else
			if(e.getActionCommand().equalsIgnoreCase("SearchClient"))
			{
				JOptionPane.showMessageDialog(new JFrame(), "Finded");
				viewX.getJtextcodeclient().setText(found.getCodeclient());
				viewX.getJtextnameclient().setText(found.getCustomerName());
			}
			else
				if(e.getActionCommand().equalsIgnoreCase("SearchArticle"))
				{
					JOptionPane.showMessageDialog(new JFrame(), "Finded");
					viewX.getJtextcodearticle().setText(found.getCodeArt());
					viewX.getJtextnamearticle().setText(found.getNameArt());
					viewX.getJtextprice().setText(String.valueOf(article.getPrice())) ;
				}		
				else
					if(e.getActionCommand().equalsIgnoreCase("Calculate"))
					{
						 
						 
							
					     price =  Double.parseDouble(viewX.getJtextprice().getText());
						 quantity = Integer.parseInt(viewX.getJtextquantity().getText());
						 
						 
						 
						//Subtotal
						subtotal = quantity * price;
						viewX.getJtextsubtotal().setText(String.valueOf(subtotal));
						//IVA	
					    iva = subtotal * 16/100; 
					    viewX.getJtextiva().setText(String.valueOf(iva));
						//Total 
						total = iva + subtotal;
						viewX.getJtexttotal().setText(String.valueOf(total));
						
						
						
					}		
		
		else 
			
			if(e.getActionCommand().equalsIgnoreCase("Include"))
			{
				String type;
				
				if (viewX.getJradiobuttonMayor().isSelected())
					type = "Mayor";
				else
					type = "Menor";
				
					found = new Sale(viewX.getJtextcodesale().getText(), 
												viewX.getJtextcodedetailsale().getText(),
												viewX.getJtextcodeclient().getText(),
												viewX.getJtextnameclient().getText(),
												viewX.getJtextdate().getText(),
												viewX.getJtextcodearticle().getText(),
												viewX.getJtextnamearticle().getText(),
												viewX.getJtextcodedeposit().getText(),
												type,
											    Integer.parseInt(viewX.getJtextquantity().getText()) ,
												Double.parseDouble(viewX.getJtextiva().getText()),
												Double.parseDouble(viewX.getJtextsubtotal().getText()),
												Double.parseDouble(viewX.getJtexttotal().getText()),
												"A");
					
		
					if(model.Include(found))
					{
						JOptionPane.showMessageDialog(new JFrame(), "Sale has been added.");
						viewX.getJtextcodesale().setEnabled(false);
						viewX.getJtextcodedetailsale().setEnabled(false);
						viewX.getJtextcodeclient().setEnabled(false);
						viewX.getJtextcodearticle().setEnabled(false);
						viewX.getJtextcodedeposit().setEnabled(false);
						Clean();
						viewX.getJtextcodesale().setEnabled(true);
						viewX.getJtextcodedetailsale().setEnabled(true);
						viewX.getJtextcodeclient().setEnabled(true);
						viewX.getJtextcodearticle().setEnabled(true);
						viewX.getJtextcodedeposit().setEnabled(true);
					}	
					else
					{
						JOptionPane.showMessageDialog(new JFrame(), "The Sale has not been added.");
						viewX.getJtextcodesale().setEnabled(false);
						viewX.getJtextcodedetailsale().setEnabled(false);
						viewX.getJtextcodeclient().setEnabled(false);
						viewX.getJtextcodearticle().setEnabled(false);
						viewX.getJtextcodedeposit().setEnabled(false);
						Clean();
						viewX.getJtextcodesale().setEnabled(true);
						viewX.getJtextcodedetailsale().setEnabled(true);
						viewX.getJtextcodeclient().setEnabled(true);
						viewX.getJtextcodearticle().setEnabled(true);
						viewX.getJtextcodedeposit().setEnabled(true);
					}
			
			}
		
			else
				if(e.getActionCommand().equalsIgnoreCase("Clean"))
				{
					viewX.getJtextcodesale().setEnabled(true);
					viewX.getJtextcodedetailsale().setEnabled(true);
					viewX.getJtextcodeclient().setEnabled(true);
					viewX.getJtextcodearticle().setEnabled(true);
					viewX.getJtextcodedeposit().setEnabled(true);
					Clean();
				}
	
	}
		public void Clean() {
			viewX.getJtextcodesale().setText("");
			viewX.getJtextcodedetailsale().setText("");
			viewX.getJtextcodeclient().setText("");	
			viewX.getJtextnameclient().setText("");
			viewX.getJtextdate().setText("");
			viewX.getJtextcodearticle().setText("");
			viewX.getJtextnamearticle().setText("");
			viewX.getJtextcodedeposit().setText("");
			viewX.getJradiobuttonDetal().setSelected(false);
			viewX.getJradiobuttonMayor().setSelected(false);	
			viewX.getJtextprice().setText("");
			viewX.getJtextquantity().setText("");
			viewX.getJtextiva().setText("");
			viewX.getJtextsubtotal().setText("");
			viewX.getJtexttotal().setText("");
		}
		
}	
