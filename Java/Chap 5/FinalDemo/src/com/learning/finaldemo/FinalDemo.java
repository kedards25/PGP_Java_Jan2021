package com.learning.finaldemo;

final class DemoP
{
	final int val=8;
	
	final void dispMsg()
	{
		System.out.println("hello from DemoP");
	}
}

public class FinalDemo extends DemoP {

	@Override
	void dispMsg()
	{
		 val=7;
		System.out.println("hello from child class "+val);
	}
	
	public static void main(String[] args) {
		

	}

}
