package com.learning.guidemo;

import javax.swing.JFrame;

public class JFrameDemo {

	JFrame jFrame;	
	
	public JFrameDemo() {
		jFrame=new JFrame();
		jFrame.setTitle("Demo Frame");
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameDemo demo=new JFrameDemo();

	}

}
