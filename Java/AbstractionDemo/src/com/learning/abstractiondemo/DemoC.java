package com.learning.abstractiondemo;

//if a class inherits an abstract class
//it has to override all the abstract methods from it
//otherwise that class also has to be declared abstract
abstract class DemoC extends AbstractClass
{
	@Override
	void display()
	{
		System.out.println("Overridden method in child class");
	}
}
