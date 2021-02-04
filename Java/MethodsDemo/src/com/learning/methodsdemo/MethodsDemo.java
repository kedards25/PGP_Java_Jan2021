package com.learning.methodsdemo;

public class MethodsDemo {

	
	//main function is an entry point for the compiler
	public static void main(String[] args) {
	
		System.out.println("Creating object of class");
		MethodsDemo methodsDemo=new MethodsDemo();
		methodsDemo.greet();
		methodsDemo.show();
		methodsDemo.disp();
		
	}
	
	void show()
	{
		System.out.println("Good Afternoon");
	}
	
	void disp()
	{
		System.out.println("Welcome to Java");
	}
	
	void greet()
	{
		System.out.println("Hello");
	}
}
