package com.learning.aopconfigdemo;

public class SecondaryClass {

	void invokeBefore()
	{
		System.out.println("Method invoked before");
	}
	
	void invokeAfter()
	{
		System.out.println("Method invoked after");
	}
	
	void invokeBeforeShow()
	{
		System.out.println("Method invoked before show()");
	}
	
	void invokeAfterShow()
	{
		System.out.println("Method invoked after show()");
	}
}
