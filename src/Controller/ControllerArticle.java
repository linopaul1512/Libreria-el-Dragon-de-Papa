package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.Article;
import Model.Client;
import Model.Model_Article;
import Model.Model_Client;
import Model.Validate;
import View.View_Article;
import View.View_Client;

public class ControllerArticle implements ActionListener {

	View_Article viewX;
	Article found;
	Model_Article model;
	Validate article;
	
    public ControllerArticle(View_Article view) {
    	viewX = view;
        model = new Model_Article();
    }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		    found = model.Search(viewX.getJtextcodeart().getText());
		    
		    if(e.getActionCommand().equalsIgnoreCase("Search")) 
		    {
		    	if((found != null) && (found.getStatus().equalsIgnoreCase("A")))
				{
					JOptionPane.showMessageDialog(new JFrame(), "Finded");
					viewX.getJtextcodeart().setText(found.getCodeArt());
					viewX.getJtextcodedeparment().setText(found.getCodeDeparment());
					viewX.getJtextcodedeparment().setEnabled(false);
					viewX.getJtextname().setText(found.getName());
					viewX.getJtextprice().setText(String.valueOf(found.getPrice()));
				}
				else if((found != null)&& (found.getStatus().equalsIgnoreCase("I")))
				{
					int i = JOptionPane.showConfirmDialog(null, "The article is deactivated. Do you want to reactivate it?", "inactive", JOptionPane.YES_NO_OPTION);
					
					if(i == JOptionPane.YES_NO_OPTION)
					{
						model.Reactive(found.getCodeArt());
						JOptionPane.showMessageDialog(new JFrame(), "Article reactivated");
					}
				}
		    }
		    else
		    	if (viewX.validate.ValidateEmptyClient())
		    	{
		    		if(e.getActionCommand().equalsIgnoreCase("Include"))
		    			{
							found = new Article(viewX.getJtextcodeart().getText(), 
															viewX.getJtextcodedeparment().getText(), 
															viewX.getJtextname().getText(),
														    Double.parseDouble(viewX.getJtextprice().getText()) ,
															"A"
															);
					if(model.Include(found))
					{
							JOptionPane.showMessageDialog(new JFrame(), "Article has been added.");
							Clean();
					}	
					else
					{
							JOptionPane.showMessageDialog(new JFrame(), "The article has not been added.");
							Clean();
					}				
					
				}
			}
				else 
				{
					JOptionPane.showMessageDialog(new JFrame(), "Please fill in all the information and do not leave any blanks.");
					Clean();
				}
		
	
			if (e.getActionCommand().equalsIgnoreCase("Clean"))
				{
					viewX.getJtextcodedeparment().setEnabled(true);
					Clean();
				}
			else if (e.getActionCommand().equalsIgnoreCase("Modify"))
				{
						
							found = new Article(viewX.getJtextcodeart().getText(), 
														viewX.getJtextcodedeparment().getText(),
														viewX.getJtextname().getText(),
														Double.parseDouble(viewX.getJtextprice().getText()) ,
														"A");
							if(model.Modify(found))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Successfully Modified Article");
								viewX.getJtextcodedeparment().setEnabled(true);
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The Article could not be modified");
								viewX.getJtextcodedeparment().setEnabled(true);
								Clean();
							}				
				}
			else if (e.getActionCommand().equalsIgnoreCase("Delete"))
					{
							found = new Article(viewX.getJtextcodeart().getText(), 
												viewX.getJtextcodedeparment().getText(), 
												viewX.getJtextname().getText(),
												Double.parseDouble(viewX.getJtextprice().getText()) ,
												"A");
							if(model.Delete(found.getCodeArt()))
							{
								JOptionPane.showMessageDialog(new JFrame(), "Article successfully removed ");
								Clean();
							}	
							else
							{
								JOptionPane.showMessageDialog(new JFrame(), "The article could not be modified");
								Clean();
							}				
					}
		}
	
		public void Clean() 
		{
			viewX.getJtextcodeart().setText("");
			viewX.getJtextcodedeparment().setText("");	
			viewX.getJtextname().setText("");					
			viewX.getJtextprice().setText("");
		}
}

