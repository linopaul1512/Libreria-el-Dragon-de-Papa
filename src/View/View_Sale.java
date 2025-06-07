package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Controller.ControllerSale;
import Model.Validate;

public class View_Sale extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JPanel panelX, panelEast, panelWest;
	private JLabel jlabelcodesale, jlabelcodeclient, jlabelnameclient, jlabelcodearticle, jlabelnamearticle, jlabeliva, jlabelquantity, jlabelsubtotal, jlabeltotal, jlabeldate, jlabelprice, jlabelcodedeposit, jlabeltypedeposit, jlabelempity,  jlabelcodedatailsale;
	private JTextField jtextcodesale, jtextcodeclient,jtextnameclient, jtextcodearticle,jtextnamearticle, jtextiva, jtextquantity, jtextsubtotal,jtexttotal, jtextdate, jtextprice, jtextcodedeposit, jtextcodedetailsale;
	private JButton jbuttonsearchclient, jbuttonsearcharticle, jbuttoninclude, jbuttonclean, jbuttoncalculate; 
	private JRadioButton jradiobuttonDetal, jradiobuttonMayor;
	ControllerSale listener;
	public Validate validate;
	
	public View_Sale(String title) {
		super(title);
		
		listener = new ControllerSale(this);
		validate = new Validate(this);
		
		panelEast = new JPanel(new GridLayout(14,1));
		panelWest = new JPanel(new GridLayout(5,1));

		jlabelcodesale = new JLabel("Code Sale");
		jlabelcodedatailsale = new JLabel ("CodeDetail Sale");
		jlabelcodeclient = new JLabel("Code Client");
		jlabelnameclient = new JLabel("Name Client");
		jlabeldate = new JLabel("Date");
		jlabelcodedeposit = new JLabel ("Code Deposit");
		jlabeltypedeposit = new JLabel("Type Deposit");
		jlabelcodearticle = new JLabel("Code Article");
		jlabelnamearticle = new JLabel("Name Article");
		jlabelprice = new JLabel("Price");
		jlabelquantity = new JLabel("Quantity");
		jlabeliva = new JLabel("IVA");
		jlabelsubtotal = new JLabel("Sub Total");
		jlabeltotal = new JLabel("Total");
		jlabelempity = new JLabel("");
		
		jradiobuttonDetal = new JRadioButton("Detal");
		jradiobuttonMayor = new JRadioButton("Mayor");
		
		jtextcodesale = new JTextField(10);
		jtextcodedetailsale = new JTextField(10);
		jtextcodeclient = new JTextField(10);
		jtextnameclient = new JTextField(10);
		jtextdate = new JTextField(10);
		jtextcodedeposit = new JTextField(10);
		jtextcodearticle = new JTextField(10);
		jtextnamearticle = new JTextField(10);
		jtextprice = new JTextField(10);
		jtextquantity = new JTextField(10);
		jtextsubtotal = new JTextField(10);
		jtextiva = new JTextField(10);
		jtexttotal = new JTextField(10);
		
	
		jbuttonsearcharticle = new JButton("Search Article");
		jbuttonsearchclient = new JButton("Search Client");
		jbuttoninclude = new JButton("Include");
		jbuttoncalculate = new JButton("Calculate");
		jbuttonclean = new JButton("Clean");
		
		
		//panel Eats
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodesale);
		panelX.add(jtextcodesale);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodeclient);
		panelX.add(jtextcodeclient);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelnameclient);
		panelX.add(jtextnameclient);
		panelEast.add(panelX);

		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeldate);
		panelX.add(jtextdate);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodedeposit);
		panelX.add(jtextcodedeposit);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeltypedeposit);
		panelX.add(jradiobuttonDetal);
		panelX.add(jlabelempity);
		panelX.add(jradiobuttonMayor);
		panelEast.add(panelX);
		
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcodearticle);
		panelX.add(jtextcodearticle);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelquantity);
		panelX.add(jtextquantity);
		panelEast.add(panelX);

		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelprice);
		panelX.add(jtextprice);
		panelEast.add(panelX);
		
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeliva);
		panelX.add(jtextiva);
		panelX.add(jtextiva).setEnabled(false);;
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelsubtotal);
		panelX.add(jtextsubtotal);
		panelX.add(jtextsubtotal).setEnabled(false);
		panelEast.add(panelX);	
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeltotal);
		panelX.add(jtexttotal);
		panelX.add(jtexttotal).setEnabled(false);
		panelEast.add(panelX);
		
		//panel West
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jbuttonsearcharticle);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jbuttonsearchclient);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jbuttoninclude);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jbuttoncalculate);
		panelWest.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jbuttonclean);
		panelWest.add(panelX);
		
		
		jbuttonclean.addActionListener(listener);
		jbuttoninclude.addActionListener(listener);
		jbuttonsearcharticle.addActionListener(listener);
		jbuttonsearchclient.addActionListener(listener);
		jbuttoncalculate.addActionListener(listener);
		
		validate = new Validate(this);
		
		jtextiva.addKeyListener(validate);
		jtextnamearticle.addKeyListener(validate);
		jtextnameclient.addKeyListener(validate);
		jtextquantity.addKeyListener(validate);
		
		
		
		this.setLayout(new BorderLayout());
		this.add(panelEast, BorderLayout.EAST);
		this.add(panelWest, BorderLayout.WEST);
				
		this.setLocation(800, 400);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
	}

	public JTextField getJtextcodesale() {
		return jtextcodesale;
	}

	public void setJtextcodesale(JTextField jtextcodesale) {
		this.jtextcodesale = jtextcodesale;
	}

	public JTextField getJtextcodeclient() {
		return jtextcodeclient;
	}

	public void setJtextcodeclient(JTextField jtextcodeclient) {
		this.jtextcodeclient = jtextcodeclient;
	}

	public JTextField getJtextnameclient() {
		return jtextnameclient;
	}

	public void setJtextnameclient(JTextField jtextnameclient) {
		this.jtextnameclient = jtextnameclient;
	}

	public JTextField getJtextcodearticle() {
		return jtextcodearticle;
	}

	public void setJtextcodearticle(JTextField jtextcodearticle) {
		this.jtextcodearticle = jtextcodearticle;
	}

	public JTextField getJtextnamearticle() {
		return jtextnamearticle;
	}

	public void setJtextnamearticle(JTextField jtextnamearticle) {
		this.jtextnamearticle = jtextnamearticle;
	}

	public JTextField getJtextiva() {
		return jtextiva;
	}

	public void setJtextiva(JTextField jtextiva) {
		this.jtextiva = jtextiva;
	}

	public JTextField getJtextquantity() {
		return jtextquantity;
	}

	public void setJtextquantity(JTextField jtextquantity) {
		this.jtextquantity = jtextquantity;
	}

	public JTextField getJtextsubtotal() {
		return jtextsubtotal;
	}

	public void setJtextsubtotal(JTextField jtextsubtotal) {
		this.jtextsubtotal = jtextsubtotal;
	}

	public JTextField getJtexttotal() {
		return jtexttotal;
	}

	public void setJtexttotal(JTextField jtexttotal) {
		this.jtexttotal = jtexttotal;
	}

	public JTextField getJtextdate() {
		return jtextdate;
	}

	public void setJtextdate(JTextField jtextdate) {
		this.jtextdate = jtextdate;
	}

	public JTextField getJtextprice() {
		return jtextprice;
	}

	public void setJtextprice(JTextField jtextprice) {
		this.jtextprice = jtextprice;
	}

	public JTextField getJtextcodedeposit() {
		return jtextcodedeposit;
	}

	public void setJtextcodedeposit(JTextField jtextcodedeposit) {
		this.jtextcodedeposit = jtextcodedeposit;
	}

	public JTextField getJtextcodedetailsale() {
		return jtextcodedetailsale;
	}

	public void setJtextcodedetailsale(JTextField jtextcodedetailsale) {
		this.jtextcodedetailsale = jtextcodedetailsale;
	}

	public JRadioButton getJradiobuttonDetal() {
		return jradiobuttonDetal;
	}

	public void setJradiobuttonDetal(JRadioButton jradiobuttonDetal) {
		this.jradiobuttonDetal = jradiobuttonDetal;
	}

	public JRadioButton getJradiobuttonMayor() {
		return jradiobuttonMayor;
	}

	public void setJradiobuttonMayor(JRadioButton jradiobuttonMayor) {
		this.jradiobuttonMayor = jradiobuttonMayor;
	}
	




	

}
