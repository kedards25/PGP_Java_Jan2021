package com.learning.tdd_demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TddTests2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass() invoked");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass() invoked");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("\nsetUp() invoked");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown() invoked");
	}
	
	ITdd tdd=new TddDemo2();
	
	@Test
	public void welcomeTest()
	{
		System.out.println("from welcomeTest");
		String msg=tdd.welcome();
		assertEquals("welcome to TDD", msg);
	}
	
	//@Ignore
	@Test
	public void greetTest()
	{
		System.out.println("from greetTest");
		String msg=tdd.greet();
		assertEquals("TDD is superb", msg);
	}
	
	


}
