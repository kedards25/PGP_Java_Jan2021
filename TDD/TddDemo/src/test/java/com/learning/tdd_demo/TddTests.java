package com.learning.tdd_demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

//Test cases help us to implement Test Driven Development
//which makes sure that our logic is working properly
//before implementing it in actual project
public class TddTests {

	TddDemo demo=new TddDemo();
	
	//Following annotation states that the method right after it has to be tested
//	@Test
	@Ignore
	public void test() {
//		fail("Not yet implemented");
		System.out.println("Hello");
	}

	@Ignore
	@Test
	public void addTest()
	{
		int ans=demo.add(5,7);
		assertEquals(15, ans);
	}
	
	@Test
	public void subTest()
	{
		int res=demo.subtract(8,4);
		//we are trying to check if expected value and 
		//actual value are same using assertEquals keyword
		//if both are same then test succeeds or else
		//test fails
		assertEquals(4, res);
	}
	
	
}
