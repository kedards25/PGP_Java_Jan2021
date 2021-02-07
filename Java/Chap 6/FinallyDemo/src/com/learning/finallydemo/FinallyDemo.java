package com.learning.finallydemo;

public class FinallyDemo {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 87, 3, 1, 73, 45 };

		try {
			for (int i = 0; i < 6; i++) {

				System.out.println(arr[i]);
			}
		} catch (Exception ex) {
			System.out.println("Exception occurred " + ex);
		}
		finally {
			System.out.println("End of the program");
		}

	}

}
