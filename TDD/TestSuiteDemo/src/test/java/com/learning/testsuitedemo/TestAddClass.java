package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddClass {

	AddClass addClass=new AddClass();
	
	@Test
	public void addTest() {
		
		int ans=addClass.addNums(5,7);
		assertEquals(12, ans);
	}

}
