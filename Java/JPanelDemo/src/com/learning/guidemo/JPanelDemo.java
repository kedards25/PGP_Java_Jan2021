package com.learning.guidemo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame {

	JPanel jPanel;
	JButton jButton;
	
	public JPanelDemo() {
		
		jButton=new JButton();
		jButton.setText("Enter");
		jButton.setBounds(50, 50, 80, 30);
		jButton.setVisible(true);
		
		jPanel=new JPanel();
		jPanel.setSize(300, 200);
		jPanel.setLayout(null);
		jPanel.setVisible(true);		
		
		jPanel.add(jButton);
		
		add(jPanel);
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		JPanelDemo demo=new JPanelDemo();
	}

}
