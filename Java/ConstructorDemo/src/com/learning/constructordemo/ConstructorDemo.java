package com.learning.constructordemo;

public class ConstructorDemo {
//	Constructors
//	are special methods used to initialize member variables dynamically
//	They have same name as that of class name
//	we need not to invoke constructors explicitly
//	they get invoked as soon as object of the class is created
//	constructors cannot have any logic within
//	They cannot have any return type
//	they can have access specifier
//	cannot be inherited
//	if no constructor is defined in the class,compiler creates a default constructor by itself
	int val;
	
	//no-arg constructor
	ConstructorDemo()
	{
		System.out.println("\nConstructor invoked");
		val=5;
	}
	
	//Parameterized constructor
	//which will accept value in the method definition
	//and that value would be assigned to variable declared in class
//	ConstructorDemo(int x)
//	{
//		System.out.println("\nParameterized Constructor invoked");
//		val=x;
//	}
	
	ConstructorDemo(int val)
	{
		System.out.println("\nParameterized Constructor invoked");
		//we are assigning the value received from paramereter named 'val'
		//to the member variable 'val' and to differentiate between the
		//parameter and member variable we are using this keyword
		this.val=val;	//'this' keyword refers to class level resource
	}
	
	void showVal()
	{
		System.out.println("Value from constructor "+val);
	}
	public static void main(String[] args) {
		
		//constructor helps in assigning values to 
		//member variables based on object
		ConstructorDemo demo=new ConstructorDemo();
		demo.showVal();
		
		ConstructorDemo demo2=new ConstructorDemo(7);
		demo2.showVal();
		
		ConstructorDemo demo3=new ConstructorDemo();
		demo3.showVal();
		
		ConstructorDemo demo4=new ConstructorDemo(12);
		demo4.showVal();

	}

}
