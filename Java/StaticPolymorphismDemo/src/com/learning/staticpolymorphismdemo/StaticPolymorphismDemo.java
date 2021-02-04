package com.learning.staticpolymorphismdemo;

public class StaticPolymorphismDemo {

	void display()
	{
		System.out.println("Welcome user");
	}
	
	void display(String user)
	{
		System.out.println("Welcome "+user);
	}
	
	void display(int val)
	{
		System.out.println("number received: "+val);
	}
	
	public static void main(String[] args) {
		
		StaticPolymorphismDemo demo=new StaticPolymorphismDemo();
		demo.display();
		demo.display(5);
		demo.display("Kedar");

	}

}
