package com.learning.helloworld;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		
		//object of the class should be created
		//with the name as that of class name
		//but in lower camel case
		Scanner scanner=new Scanner(System.in);
		String name;
		int num;
		
		System.out.println("Please enter your name:");
		name=scanner.next();
		//num=scanner.nextInt();
		
		System.out.println("Hello "+name);
	}

}
