package com.learning.eventhandlingdemo2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EventHandlingDemo2 extends JFrame {

	JPanel pnlContent;
	JLabel lblUserName,lblGreet;
	JTextField txtUserName;
	JButton btnSubmit,btnReset;
	
	public EventHandlingDemo2() {
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
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String val=txtUserName.getText();
				lblGreet.setText("Welcome "+val);
				
			}
		});
		
		
		btnReset=new JButton();
		btnReset.setText("Cancel");
		btnReset.setBounds(230, 100, 80, 20);
		//here we are associating event with event handler
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText("");
				
			}
		});
		
		
		lblGreet=new JLabel();
		lblGreet.setBounds(150, 150, 150, 30);
		
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
	
	public static void main(String[] args) {
		EventHandlingDemo2 demo=new EventHandlingDemo2();

	}

}
