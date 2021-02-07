package com.learning.throwdemo;

public class ThrowDemo {
	
	void divide(int val1,int val2)
	{
		if(val2==0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println(val1/val2);
		}
	}

	public static void main(String[] args) {
		
		ThrowDemo demo=new ThrowDemo();
		
		try
		{
			demo.divide(10, 0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error: "+ex);
		}

	}

}
