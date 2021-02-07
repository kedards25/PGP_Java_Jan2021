package com.learning.abstractiondemo;

abstract class AbstractClass
{
	//Abstract classes allow us to implement
	//abstraction by declaring methods without body
	//as these methods are without body
	//these have to be declared abstract
	//using keyword 'abstract'
	//if a class contains any abstract method
	//then the class also has to be declared abstract
	//abstract classes are considered to be incomplete classes
	//hence we need to inherit them by child classes
	//and override the abstract methods
	//and due to same we cannot create object of abstract classes
	
	abstract void display();
	
	abstract void greet();
	
	//abstract class can have abstract and non-abstract methods
	void show()
	{
		System.out.println("Hello from abstract class");
	}
}
