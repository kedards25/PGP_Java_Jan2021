package com.learning.trycatchdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int[] arr=new int[] {5,87,3,1,73,45};
		
		try
		{
			for (int i = 0; i < 8; i++) {
				
				System.out.println(arr[i]);
			}
		}
		//piping
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
//		catch(Exception ex)
//		{
//			System.out.println("Exception occurred "+ex);
//		}	

	}

}
