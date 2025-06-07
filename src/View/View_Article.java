package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ControllerArticle;
import Model.Validate;

public class View_Article extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	
	private JPanel panelX, panelEast, panelWest;
	private JButton jbuttonsearch, jbuttoninclude, jbuttonmodify, jbuttonclean, jbuttondelete; 
	private JLabel jlabelname, jlabelcodeart, jlabelcodedeparment, jlabelprice, jlabelquantity;
	private JTextField jtextname, jtextcodeart, jtextcodedeparment, jtextprice, jtextquantity;;
	ControllerArticle listener;
	public Validate validate;
	
	public View_Article(String title) {
		super(title);
		
		listener = new ControllerArticle(this);
		validate = new Validate (this);
		
		panelEast = new JPanel(new GridLayout(5,1));
		panelWest = new JPanel(new GridLayout(5,1));
		
		jlabelcodeart = new JLabel("Code Article");
		jlabelcodedeparment = new JLabel("Code Deparment");
		jlabelname = new JLabel("Name");
		jlabelprice= new JLabel("Price");
		jlabelquantity = new JLabel("Quantity");
		
		
		jtextcodeart = new JTextField(10);
		jtextcodedeparment = new JTextField(10);
		jtextname = new JTextField(10);
		jtextprice= new JTextField(10);		
		jtextquantity = new JTextField(10);
		
		jbuttonclean = new JButton("Clean");
		jbuttonsearch = new JButton("Search");
		jbuttonmodify = new JButton("Modify");
		jbuttondelete = new JButton("Delete");
		jbuttoninclude = new JButton("Include");
		
		//panel Eats
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodeart);
		panelX.add(jtextcodeart);
		panelEast.add(panelX);

		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodedeparment);
		panelX.add(jtextcodedeparment);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelname);
		panelX.add(jtextname);
		panelEast.add(panelX);
		
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelprice);
		panelX.add(jtextprice);
		panelEast.add(panelX);
		
	
		
		//panel West
		panelX = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelX.add(jbuttoninclude);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelX.add(jbuttonmodify);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelX.add(jbuttondelete);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelX.add(jbuttonsearch);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelX.add(jbuttonclean);
		panelWest.add(panelX);
		
		jbuttonclean.addActionListener(listener);
		jbuttondelete.addActionListener(listener);
		jbuttoninclude.addActionListener(listener);
		jbuttonmodify.addActionListener(listener);
		jbuttonsearch.addActionListener(listener);
		
		jtextname.addKeyListener(validate);
		jtextprice.addKeyListener(validate);
	
		this.setLayout(new BorderLayout());
		this.add(panelEast, BorderLayout.EAST);
		this.add(panelWest, BorderLayout.WEST);
				
		this.setLocation(800, 400);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		
	}

	public JTextField getJtextname() {
		return jtextname;
	}

	public void setJtextname(JTextField jtextname) {
		this.jtextname = jtextname;
	}

	public JTextField getJtextcodeart() {
		return jtextcodeart;
	}

	public void setJtextcodeart(JTextField jtextcodeart) {
		this.jtextcodeart = jtextcodeart;
	}

	public JTextField getJtextcodedeparment() {
		return jtextcodedeparment;
	}

	public void setJtextcodedeparment(JTextField jtextcodedeparment) {
		this.jtextcodedeparment = jtextcodedeparment;
	}

	public JTextField getJtextprice() {
		return jtextprice;
	}

	public void setJtextprice(JTextField jtextprice) {
		this.jtextprice = jtextprice;
	}


	
	
	
	

}
