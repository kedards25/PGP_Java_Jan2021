package com.learning.multilevelinheritancedemo;

//methods in interface are public abstract by default
//we cannot declare variables in an interface
//but we can have constants in an interface
interface DemoP {
	//constants should be written in UPPERCASE by convention
	int NUM=5;
}

interface DemoP2 extends DemoP{
	void show();
}
	 
	

public class MultilevelInheritanceDemo implements DemoP2{

	 @Override
	 public void show()	 {
		 System.out.println("Method overidden from DemoP2 "+NUM);
	 }
	 
	public static void main(String[] args) {
		MultilevelInheritanceDemo demo=new MultilevelInheritanceDemo();
		demo.show();
	}
}
