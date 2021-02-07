package com.learning.superdemo;

class DemoP
{
	DemoP()
	{
		System.out.println("From parent class constructor");
	}
	
	DemoP(int val)
	{
		System.out.println("value from parent class: "+val);
	}
	
}

public class SuperDemo extends DemoP {

	//call to superclass constructor is given by default
	//if no-arg constructor is defined
	SuperDemo()
	{
		//super keyword is used to invoke constructor from parent class
		//super();
		System.out.println("From child class Constructor");
	}
	
	//call to superclass constructor should be given explicitly
	//if parameterized constructor is defined
	SuperDemo(int num,int num2)
	{
		//super has to be the first statement of 
		//child class constructor
		super(num2);
		System.out.println("value from child class: "+num);
	}
	
	public static void main(String[] args) {
		SuperDemo demo=new SuperDemo();
		
		SuperDemo demo2=new SuperDemo(10,25);

	}

}
