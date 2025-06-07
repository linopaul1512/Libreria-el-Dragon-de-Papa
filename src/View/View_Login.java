package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ControllerLogin;
import Model.Validate;

public class View_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel jlabelusername, jlabelpassword;
	private JTextField jtextusername, jtextpassword;
	private JButton jbuttonclean, jbuttonenter;
	private JPanel panelSouth, panelNorth, panelX;
	ControllerLogin listener;
	public Validate validate;
	
	
	public View_Login (String title) {
		super(title);

		listener = new ControllerLogin(this);
		
		panelNorth = new JPanel(new GridLayout(2,1));
		panelSouth = new JPanel(new FlowLayout( FlowLayout.CENTER));
		
		jlabelusername = new JLabel("Username");
		jlabelpassword = new JLabel("Password");
		
		jtextusername = new JTextField(15);
		jtextpassword = new JTextField(15);
		
		jbuttonenter = new JButton("Enter");
		jbuttonclean = new JButton("Clean");
		
		//panel North
		panelX = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelX.add(jlabelusername);
		panelX.add(jtextusername);
		panelNorth.add(panelX);
		
		
		panelX = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelX.add(jlabelpassword);
		panelX.add(jtextpassword);
		panelNorth.add(panelX);
		
		//Panel South
		panelX = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelX.add(jbuttonenter);
		panelX.add(jbuttonclean);
		panelSouth.add(panelX);
		
		validate = new Validate(this);
		jtextusername.addKeyListener(validate);
		jtextusername.addKeyListener(validate);
		
		jbuttonclean.addActionListener(listener);
		jbuttonenter.addActionListener(listener);
		
		
		
		
		
		//This
		this.setLayout(new BorderLayout());
		this.add(panelNorth, BorderLayout.NORTH);
		this.add(panelSouth, BorderLayout.SOUTH);
		
		this.setLocation(800, 400);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
			
		
	}
	
	
	//Main
	public static void main(String[] args) {
		new View_Login("Login");
	}


	//set y get
	public JLabel getJlabelusername() {
		return jlabelusername;
	}



	public void setJlabelusername(JLabel jlabelusername) {
		this.jlabelusername = jlabelusername;
	}



	public JLabel getJlabelpassword() {
		return jlabelpassword;
	}



	public void setJlabelpassword(JLabel jlabelpassword) {
		this.jlabelpassword = jlabelpassword;
	}



	public JTextField getJtextusername() {
		return jtextusername;
	}



	public void setJtextusername(JTextField jtextusername) {
		this.jtextusername = jtextusername;
	}



	public JTextField getJtextpassword() {
		return jtextpassword;
	}



	public void setJtextpassword(JTextField jtextpassword) {
		this.jtextpassword = jtextpassword;
	}



	public JButton getJbuttonclean() {
		return jbuttonclean;
	}



	public void setJbuttonclean(JButton jbuttonclean) {
		this.jbuttonclean = jbuttonclean;
	}



	public JButton getJbuttoninclude() {
		return jbuttonenter;
	}



	public void setJbuttoninclude(JButton jbuttoninclude) {
		this.jbuttonenter = jbuttoninclude;
	}



	public ControllerLogin getListener() {
		return listener;
	}



	public void setListener(ControllerLogin listener) {
		this.listener = listener;
	}


	
}
