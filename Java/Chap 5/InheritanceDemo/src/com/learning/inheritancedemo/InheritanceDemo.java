package com.learning.inheritancedemo;

//we can have only one public class in 
//given package with same name as that of
//file name and that public class should
//include main function
class DemoP
{
	int demoVal=8;	
}

public class InheritanceDemo extends DemoP {
	
	void showVal()
	{
		System.out.println("Value from other class: "+demoVal);
	}

	public static void main(String[] args) {
		InheritanceDemo inheritanceDemo=new InheritanceDemo();
		inheritanceDemo.showVal();

	}

}
