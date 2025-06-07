package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ControllerDeparment;
import Model.Validate;

public class View_Deparment extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelX, panelEast, panelWest;
	private JTextField jtextname, jtextcodedep, jtexttype;
	private JLabel jlabelname, jlabelcodedep, jlabeltype;
	private JButton jbuttonsearch, jbuttoninclude, jbuttonmodify, jbuttonclean, jbuttondelete; 
	ControllerDeparment listener;
	public Validate validate;
	
	
	public View_Deparment(String title) {
		super(title);
		
		listener = new ControllerDeparment(this);
	
		
		panelEast = new JPanel(new GridLayout(3,1));
		panelWest = new JPanel(new GridLayout(5,1));
		
		jlabelname = new JLabel("Name");
		jlabelcodedep = new JLabel("Code Deparment");
		jlabeltype = new JLabel("Type");
		
		
		jtextcodedep = new JTextField(10);
		jtextname = new JTextField(10);
		jtexttype = new JTextField(10);
		
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
		panelX.add(jlabelcodedep);
		panelX.add(jtextcodedep);
		panelEast.add(panelX);
		
		
	
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeltype);
		panelX.add(jtexttype);
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





	public JTextField getJtextcodedep() {
		return jtextcodedep;
	}





	public void setJtextcodedep(JTextField jtextcodedep) {
		this.jtextcodedep = jtextcodedep;
	}





	public JTextField getJtexttype() {
		return jtexttype;
	}





	public void setJtexttype(JTextField jtexttype) {
		this.jtexttype = jtexttype;
	}





	public JLabel getJlabelcodedep() {
		return jlabelcodedep;
	}





	public void setJlabelcodedep(JLabel jlabelcodedep) {
		this.jlabelcodedep = jlabelcodedep;
	}




	public JLabel getJlabeltype() {
		return jlabeltype;
	}





	public void setJlabeltype(JLabel jlabeltype) {
		this.jlabeltype = jlabeltype;
	}





	public JButton getJbuttonsearch() {
		return jbuttonsearch;
	}





	public void setJbuttonsearch(JButton jbuttonsearch) {
		this.jbuttonsearch = jbuttonsearch;
	}





	public JButton getJbuttoninclude() {
		return jbuttoninclude;
	}





	public void setJbuttoninclude(JButton jbuttoninclude) {
		this.jbuttoninclude = jbuttoninclude;
	}





	public JButton getJbuttonmodify() {
		return jbuttonmodify;
	}





	public void setJbuttonmodify(JButton jbuttonmodify) {
		this.jbuttonmodify = jbuttonmodify;
	}





	public JButton getJbuttonclean() {
		return jbuttonclean;
	}





	public void setJbuttonclean(JButton jbuttonclean) {
		this.jbuttonclean = jbuttonclean;
	}





	public JButton getJbuttondelete() {
		return jbuttondelete;
	}





	public void setJbuttondelete(JButton jbuttondelete) {
		this.jbuttondelete = jbuttondelete;
	}

	


}
