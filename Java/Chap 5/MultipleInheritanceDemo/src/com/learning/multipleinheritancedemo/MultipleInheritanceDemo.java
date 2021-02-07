package com.learning.multipleinheritancedemo;


//methods in interface are public abstract by default
//we cannot declare variables in an interface
//but we can have constants in an interface
 interface DemoP {
	//constants should be written in UPPERCASE by convention
	int NUM=5;
	void disp();
	DemoP demoP=new MultipleInheritanceDemo();
}

 interface DemoP2 {
	void show();
	DemoP2 demoP2=new MultipleInheritanceDemo();
}

 public class MultipleInheritanceDemo implements DemoP,DemoP2
 {
	 
	 @Override
	 public void show()	 {
		 System.out.println("Method overidden from DemoP2 "+NUM);
	 }
	 
	 @Override
	 public void disp()	 {
		 System.out.println("Hello from Interce DemoP");
	 }
	 
	public static void main(String[] args) {
//		MultipleInheritanceDemo demo=new MultipleInheritanceDemo();
//		demo.show();
		
		demoP.disp();
		demoP2.show();
	}
 }