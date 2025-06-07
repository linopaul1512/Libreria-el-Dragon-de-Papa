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

import Controller.ControllerClient;
import Model.Validate;

public class View_Client extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panelX, panelEast, panelWest;
	private JLabel jlabelname, jlabellastname, jlabelcode, jlabelsex, jlabeladress, jlabelID, jlabelempity;
	private JTextField jtextname, jtextlastname, jtextcode, jtextadress, jtextID;
	private JButton jbuttonsearch, jbuttoninclude, jbuttonmodify, jbuttonclean, jbuttondelete; 
	private JRadioButton jradiobuttonsexfemale, jradiobuttonsexmale;
	ControllerClient listener;
	public Validate validate;

	
	public View_Client(String title) {
		super(title);
	
		panelEast = new JPanel(new GridLayout(7,1));
		panelWest = new JPanel(new GridLayout(5,1));
		
		listener = new ControllerClient(this);
		
		
		jlabelcode = new JLabel("Code");
		jlabelname = new JLabel("Name");
		jlabellastname= new JLabel("Lastname");
		jlabelsex = new JLabel("Sex");
		jlabeladress = new JLabel("Adress");
		jlabelID = new JLabel("ID");
		jlabelempity = new JLabel("");
		
		jtextcode = new JTextField(10);
		jtextname = new JTextField(20);
		jtextlastname = new JTextField(20);
		jradiobuttonsexfemale = new JRadioButton("female");
		jradiobuttonsexmale = new JRadioButton("Male");
		jtextadress = new JTextField(20);
		jtextID = new JTextField(20);
		
		jbuttonclean = new JButton("Clean");
		jbuttonsearch = new JButton("Search");
		jbuttonmodify = new JButton("Modify");
		jbuttondelete = new JButton("Delete");
		jbuttoninclude = new JButton("Include");
		
		
		//panel Eats
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelcode);
		panelX.add(jtextcode);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelname);
		panelX.add(jtextname);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabellastname);
		panelX.add(jtextlastname);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelsex);
		panelX.add(jradiobuttonsexmale);
		panelX.add(jlabelempity);
		panelX.add(jradiobuttonsexfemale);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabeladress);
		panelX.add(jtextadress);
		panelEast.add(panelX);
		
		panelX = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelX.add(jlabelID);
		panelX.add(jtextID);
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
		
		
		
		jtextcode.addKeyListener(validate);
		jtextname.addKeyListener(validate);
		jtextlastname.addKeyListener(validate);
		jtextadress.addKeyListener(validate);
		jtextID.addKeyListener(validate);
		
		
		
		
		
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


	public JTextField getJtextlastname() {
		return jtextlastname;
	}


	public void setJtextlastname(JTextField jtextlastname) {
		this.jtextlastname = jtextlastname;
	}


	public JTextField getJtextcode() {
		return jtextcode;
	}


	public void setJtextcode(JTextField jtextcode) {
		this.jtextcode = jtextcode;
	}


	public JTextField getJtextadress() {
		return jtextadress;
	}


	public void setJtextadress(JTextField jtextadress) {
		this.jtextadress = jtextadress;
	}


	public JTextField getJtextID() {
		return jtextID;
	}


	public void setJtextID(JTextField jtextID) {
		this.jtextID = jtextID;
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


	public JRadioButton getJradiobuttonsexfemale() {
		return jradiobuttonsexfemale;
	}


	public void setJradiobuttonsexfemale(JRadioButton jradiobuttonsexfemale) {
		this.jradiobuttonsexfemale = jradiobuttonsexfemale;
	}


	public JRadioButton getJradiobuttonsexmale() {
		return jradiobuttonsexmale;
	}


	public void setJradiobuttonsexmale(JRadioButton jradiobuttonsexmale) {
		this.jradiobuttonsexmale = jradiobuttonsexmale;
	}
	


}
