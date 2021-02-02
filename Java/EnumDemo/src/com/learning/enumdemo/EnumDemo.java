package com.learning.enumdemo;

enum Fruits{Mango,Chickoo,Banana,Orange,Guava}

public class EnumDemo {

	public static void main(String[] args) {
		//Iterating through all the available
		//values of fruits using an iterator
		//named fruit of type Fruits
		for(Fruits fruit:Fruits.values())
		{
			System.out.println(fruit);
		}

	}

}
