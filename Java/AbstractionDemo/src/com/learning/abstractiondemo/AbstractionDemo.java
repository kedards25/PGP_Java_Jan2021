package com.learning.abstractiondemo;

//the class inheriting an abstract class 
//must override abstract methods
public class AbstractionDemo extends DemoC {

	//anything with prefix '@'
	//is called as annotation
	@Override
	void greet()
	{
		System.out.println("Overridden method in main class");
	}
	
	void show()
	{
		System.out.println("new method from child class");
	}
	
	public static void main(String[] args) {
		AbstractionDemo demo=new AbstractionDemo();
		demo.display();
		demo.show();

	}

}
