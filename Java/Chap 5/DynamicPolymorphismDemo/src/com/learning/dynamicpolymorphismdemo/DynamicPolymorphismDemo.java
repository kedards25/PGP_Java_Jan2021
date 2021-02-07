package com.learning.dynamicpolymorphismdemo;

class DemoP
{
	public void showVal()
	{
		System.out.println("method from parent class");
	}
}

public class DynamicPolymorphismDemo extends DemoP {

	@Override
	public void showVal()
	{
		System.out.println("method overidden in child class");
	}
	
	public static void main(String[] args) {
		
//		DemoP demoP=new DemoP();
//		demoP.showVal();
		
//		DynamicPolymorphismDemo demo=new DynamicPolymorphismDemo();
//		demo.showVal();
		
		//parent class is being initialised by 
		//child class
		//and this association happens at runtime
		//hence it is called as dynamic polymorphism
		
		//upward casting
		//implicit
//		DemoP demoP=new DynamicPolymorphismDemo();	//auto boxing
//		demoP.showVal();
		
		DemoP dp=new DemoP();
		//downward object casting
		//object of parent class being casted to type of child class
		//explicit
		//***downward casting is valid only at compile time
		//***but throws an exception at runtime
		DynamicPolymorphismDemo demo=(DynamicPolymorphismDemo)dp;	//auto unboxing
		demo.showVal();

	}

}
