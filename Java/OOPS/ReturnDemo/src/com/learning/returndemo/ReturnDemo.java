package com.learning.returndemo;

public class ReturnDemo {
//When a function performs the logic and wants to pass 
//the output to the another function,it is said that function
//is returning the value
	int sampleVal=7;
	
	//called function will return the value to calling function
	int incrVal()	//called function
	{
		//when a function returns a value
		//the type of value it is returning would be
		//the return type of the function
		return ++sampleVal;
	}
	
	//if a function is not returning anything
	//it means it returns void(nothing)
	void dispVal()
	{
		//we should declare a variable to accept
		//returned value
		int receivedVal=incrVal();//calling function
		System.out.println(receivedVal);
	}
	
	public static void main(String[] args) {
		
		ReturnDemo returnDemo=new ReturnDemo();
		returnDemo.dispVal();
	}

}
