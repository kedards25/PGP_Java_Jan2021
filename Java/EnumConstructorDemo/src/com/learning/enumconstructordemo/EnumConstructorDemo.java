package com.learning.enumconstructordemo;

enum Fruits{
	
	Mango(250),Chickoo(100),Banana(40),Orange(60),Guava(50);
	
	private int price;
	
	private Fruits(int p) {
		price=p;
	}
	
	int getPrice()
	{
		return price;
	}
}

public class EnumConstructorDemo {

	public static void main(String[] args) {
		//we are accessing the individual value from 
		//given range of enum values
		Fruits fruit=Fruits.Mango;
		
		System.out.println("Price of Mangoes "+fruit.getPrice());

	}

}
