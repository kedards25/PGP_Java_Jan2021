package com.learning.oopsdemo;

import java.util.Scanner;

public class OOPS_Demo {
	//declaring variables to be used throughout the class
	int num1,num2,ans;
	
	//creating object of Predefined Scanner class
	//from java.util package to accept user input
	Scanner scanner=new Scanner(System.in);
	
	//Declaring function to accept values from user
	void acceptNums()
	{
		System.out.println("Enter two numbers");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
	}
	
	//function to perform addition operation
	void addNums()
	{
		ans=num1+num2;
	}
	
	void subtractNums()
	{
		ans=num1-num2;
	}
	
	//function to display the result
	void displayAns()
	{
		System.out.println("Addition of "+num1+" and "+num2+" is "+ans);
	}
	
	public static void main(String[] args) {
		
		//in order to access members of class 
		//we will create the object of class
		//object will help compiler to access 
		//member variables and functions of the class
		OOPS_Demo oopsDemo=new OOPS_Demo();
		//ClassName className=new ClassName();
		
		//we shall invoke the functions of the class
		//using the object that we create
		oopsDemo.acceptNums();
		oopsDemo.addNums();
		oopsDemo.displayAns();

		//using feature of re-usability
		oopsDemo.acceptNums();
		oopsDemo.subtractNums();
		oopsDemo.displayAns();

	}

}
