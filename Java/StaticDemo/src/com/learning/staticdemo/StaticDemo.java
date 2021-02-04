package com.learning.staticdemo;

public class StaticDemo {
	//static is called as access-modifier
	//anything which is declared as static
	//will maintain its value for next execution
	//members declared as static exist
	//even before the execution of code and 
	//hence they are called as class-level resources
	
	static int val=5;
	int val2=12;
	
	//static functions cannot access not static variables
	static void dispVal()
	{
		val++;
		System.out.println("static val: "+val);
	}
	
	 void dispVal2()
	{
		val2++;
		System.out.println("non-static val: "+val2);
	}
	
	public static void main(String[] args) {
		//as static functions are class-level resources
		//we can access them without object
		StaticDemo.dispVal();		//6
		dispVal();		//7
		dispVal();		//8
		
		System.out.println();
		StaticDemo demo=new StaticDemo();		//val2++=>13
		demo.dispVal2();
		
		StaticDemo demo2=new StaticDemo();		//val2++=>13
		demo2.dispVal2();
		
		StaticDemo demo3=new StaticDemo();		//val2++=>13
		demo3.dispVal2();
		
		
	}

}
