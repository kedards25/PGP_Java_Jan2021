package com.learning.guidemo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonDemo extends JFrame {

	JButton jButton;
//	JFrame contentFrame;
	public JButtonDemo() {
		jButton=new JButton();
		jButton.setText("Enter");
		jButton.setSize(80, 30);
		jButton.setVisible(true);
		
//		contentFrame=new JFrame();
//		contentFrame.setSize(400, 300);
//		contentFrame.add(jButton);
//		contentFrame.setVisible(true);
		setSize(400, 300);
		add(jButton);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		JButtonDemo demo=new JButtonDemo();

	}

}
