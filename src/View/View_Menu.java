package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.ControllerMenu;

public class View_Menu extends JFrame {
private static final long serialVersionUID = 1L;
	
	private JPanel panelX, panelNorth, panelSouth;
	private JButton  jbuttonclient, jbuttonarticle, jbuttondeparment, jbuttondeposit, jbuttonsale, jbuttonreport;
	ControllerMenu listener;
	
	
	public View_Menu(String title) {
		super(title);
		
		listener = new ControllerMenu(this);
		
		panelNorth = new JPanel(new GridLayout(1,4));
		panelSouth = new JPanel(new GridLayout(1,3));
		
		jbuttonclient= new JButton("Client");			
		jbuttonarticle = new JButton("Article");
		jbuttondeparment = new JButton("Deparment");
		jbuttondeposit = new JButton("Deposit");
		jbuttonsale = new JButton ("Sale");
		jbuttonreport = new JButton("Report");

		
	
		//panel North
		panelX = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelX.add(jbuttonclient);
		panelX.add(jbuttonarticle);
		panelX.add(jbuttondeparment);
		panelX.add(jbuttondeposit);
		panelNorth.add(panelX);
		
		//panel South
		panelX = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelX.add(jbuttonsale);
		panelX.add(jbuttonreport);
		panelSouth.add(panelX);
		
		jbuttonarticle.addActionListener(listener);
		jbuttonclient.addActionListener(listener);
		jbuttondeparment.addActionListener(listener);
		jbuttondeposit.addActionListener(listener);
		jbuttonreport.addActionListener(listener);
		jbuttonsale.addActionListener(listener);
	
		
		
		
		//This
		this.setLayout(new BorderLayout());
		this.add(panelNorth, BorderLayout.NORTH);
		this.add(panelSouth, BorderLayout.SOUTH);
				
		this.setLocation(800, 400);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
					
	}
	
	
	
	
	
	
	public JButton getJbuttonclient() {
		return jbuttonclient;
	}

	public void setJbuttonclient(JButton jbuttonclient) {
		this.jbuttonclient = jbuttonclient;
	}
	
	public JButton getJbuttonarticle() {
		return jbuttonarticle;
	}

	public void setJbuttonarticle(JButton jbuttonarticle) {
		this.jbuttonarticle = jbuttonarticle;
	}
	
	public JButton getJbuttondeparment() {
		return jbuttondeparment;
	}

	public void setJbuttondeparment(JButton jbuttondeparment) {
		this.jbuttondeparment = jbuttondeparment;
	}

	public JButton getJbuttondeposit() {
		return jbuttondeposit;
	}

	public void setJbuttondeposit(JButton jbuttondeposit) {
		this.jbuttondeposit = jbuttondeposit;
	}

	public JButton getJbuttonsale() {
		return jbuttonsale;
	}

	public void setJbuttonsale(JButton jbuttonsale) {
		this.jbuttonsale = jbuttonsale;
	}
	
	public JButton getJbuttonreport() {
		return jbuttonreport;
	}

	public void setJbuttonreport(JButton jbuttonreport) {
		this.jbuttonreport = jbuttonreport;
	}


	public ControllerMenu getListener() {
		return listener;
	}

	public void setListener(ControllerMenu listener) {
		this.listener = listener;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
