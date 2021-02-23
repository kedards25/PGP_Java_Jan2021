package com.learning.eventhandlingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventHandlingDemo extends JFrame implements ActionListener {

	JPanel pnlContent;
	JLabel lblUserName,lblGreet;
	JTextField txtUserName;
	JButton btnSubmit,btnReset;
	
	public EventHandlingDemo() {
		lblUserName=new JLabel();
		lblUserName.setText("Enter your name");
		lblUserName.setBounds(70, 50, 100, 20);
		lblUserName.setVisible(true);
		
		txtUserName=new JTextField();
		txtUserName.setBounds(220, 50, 120, 20);
		
		btnSubmit=new JButton();
		btnSubmit.setText("Submit");
		btnSubmit.setBounds(130, 100, 80, 20);
		//here we are associating event with event handler
		btnSubmit.addActionListener(this);
		
		btnReset=new JButton();
		btnReset.setText("Cancel");
		btnReset.setBounds(230, 100, 80, 20);
		//here we are associating event with event handler
		btnReset.addActionListener(this);
		
		lblGreet=new JLabel();
		lblGreet.setBounds(150, 150, 100, 30);
		
		pnlContent=new JPanel();
		pnlContent.add(lblUserName);
		pnlContent.add(txtUserName);
		pnlContent.add(btnSubmit);
		pnlContent.add(btnReset);
		pnlContent.add(lblGreet);
		pnlContent.setSize(500, 400);
		pnlContent.setLayout(null);
		pnlContent.setVisible(true);
		
		add(pnlContent);
		setSize(500, 400);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnSubmit))
		{
			String val=txtUserName.getText();
			lblGreet.setText("Welcome "+val);
		}
		else
		{
			txtUserName.setText("");
		}
		
	}
	
	public static void main(String[] args) {
		
		EventHandlingDemo demo=new EventHandlingDemo();

	}



}
