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


import Controller.ControllerDeposit;
import Model.Validate;

public class View_Deposit extends JFrame {

	private static final long serialVersionUID = 1L;
	
	
	private JPanel panelX, panelEast, panelWest;
	private JTextField jtextname, jtextcod;
	private JLabel jlabelname, jlabelcod, jlabeltype, jlabelempity;
	private JButton jbuttonsearch, jbuttoninclude, jbuttonmodify, jbuttonclean, jbuttondelete; 
	private JRadioButton jradiobuttonDetal, jradiobuttonMayor;
	ControllerDeposit listener;
	public Validate validate;

	
	
	
	public View_Deposit(String title) {
		super(title);
		
		listener = new ControllerDeposit(this);
		
		
		panelEast = new JPanel(new GridLayout(3,1));
		panelWest = new JPanel(new GridLayout(5,1));
		
		jlabelname = new JLabel("Name");
		jlabelcod = new JLabel("Code Deposit");
		jlabeltype = new JLabel("Type");
		jlabelempity = new JLabel("");
		
		
		jtextcod = new JTextField(10);
		jtextname = new JTextField(10);
		
		jradiobuttonDetal = new JRadioButton("Detal");
		jradiobuttonMayor = new JRadioButton("Mayor");
		
		jbuttonclean = new JButton("Clean");
		jbuttonsearch = new JButton("Search");
		jbuttonmodify = new JButton("Modify");
		jbuttondelete = new JButton("Delete");
		jbuttoninclude = new JButton("Include");
		
		
		//panel Eats
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelname);
		panelX.add(jtextname);
		panelEast.add(panelX);

		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcod);
		panelX.add(jtextcod);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeltype);
		panelX.add(jradiobuttonDetal);
		panelX.add(jlabelempity);
		panelX.add(jradiobuttonMayor);
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
		
		validate = new Validate(this);
		
		jtextcod.addKeyListener(validate);
		jtextname.addKeyListener(validate);
		
		
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



	public JTextField getJtextcod() {
		return jtextcod;
	}



	public void setJtextcod(JTextField jtextcod) {
		this.jtextcod = jtextcod;
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
