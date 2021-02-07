package com.learning.userdefinedexceptionsdemo;

class DivideByZeroException extends Exception
{
	//super keyword allows us to invoke 
	//constructor of parent class from child
	public DivideByZeroException(String errMsg) {
		super(errMsg);
	}
}

public class UserDefinedExceptionDemo {
	
	void divide(int val1,int val2)
	{
		try
		{
			if(val2==0)
			{
				throw new DivideByZeroException("divisor cannot be zero");
			}
		}
		//DivideByZeroException x=new DivideByZeroException("divisor cannot be zero");
		catch(DivideByZeroException x)
		{
			System.out.println("Error occurred: "+x);
		}
		
	}

	public static void main(String[] args) {
		
		UserDefinedExceptionDemo demo=new UserDefinedExceptionDemo();
		demo.divide(5, 0);
		

	}

}
