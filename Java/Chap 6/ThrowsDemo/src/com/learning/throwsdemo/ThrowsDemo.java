package com.learning.throwsdemo;

public class ThrowsDemo {

	void divide(int val1,int val2) throws Exception
	{
//		if(val2==0)
//		{
//			throw new Exception();
//		}
//		else
//		{
//			System.out.println(val1/val2);
//		}
		
		System.out.println(val1/val2);
	}
	
	public static void main(String[] args) {
		
		ThrowsDemo demo=new ThrowsDemo();
		try {
			demo.divide(10, 0);
		} catch (Exception e) {
			System.out.println("Error :"+e);
		}
	}

}
