package com.learning.guidemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//to imply action handler for button click
//we are implementing ActionListner interface
//we have to override method called ActionPerformed from the said interface
public class GUI_Demo extends JFrame implements ActionListener {

	JPanel pnlContent;
	JLabel lblUserName,lblGreet;
	JTextField txtUserName;
	JButton btnSubmit;
	
	public GUI_Demo() {
		lblUserName=new JLabel();
		lblUserName.setText("Enter your name");
		lblUserName.setBounds(70, 50, 100, 20);
		lblUserName.setVisible(true);
		
		txtUserName=new JTextField();
		txtUserName.setBounds(220, 50, 120, 20);
		
		btnSubmit=new JButton();
		btnSubmit.setText("Submit");
		btnSubmit.setBounds(150, 100, 80, 20);
		//here we are associating event with event handler
		btnSubmit.addActionListener(this);
		
		lblGreet=new JLabel();
		lblGreet.setBounds(150, 150, 100, 30);
		
		pnlContent=new JPanel();
		pnlContent.add(lblUserName);
		pnlContent.add(txtUserName);
		pnlContent.add(btnSubmit);
		pnlContent.add(lblGreet);
		pnlContent.setSize(500, 400);
		pnlContent.setLayout(null);
		pnlContent.setVisible(true);
		
		add(pnlContent);
		setSize(500, 400);
		setLayout(null);
		setVisible(true);
	}
	
	//here we are writing code for event handling of click event
	@Override
	public void actionPerformed(ActionEvent e) {
		String val=txtUserName.getText();
		lblGreet.setText("Welcome "+val);
	}
	
	public static void main(String[] args) {
		
		GUI_Demo demo=new GUI_Demo();

	}



}
