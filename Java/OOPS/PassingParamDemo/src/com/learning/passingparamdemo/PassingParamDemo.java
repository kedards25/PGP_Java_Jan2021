package com.learning.passingparamdemo;

public class PassingParamDemo {

	int val;
	
	//access_specifier [access_modifier] return_type <method_name>([param_list]){}
	//public void show(int sample){}
	void greetUser(String userName)
	{
		System.out.println("Welcome "+userName);
	}
	
	//parameter has block scope
	//it cannot be accessed outside the block in which it is
	//declared
	void dispNum(int num)
	{
		val=num;
		System.out.println("You are visitor no: "+val);
	}
	
	public static void main(String[] args) {
		
		PassingParamDemo demo=new PassingParamDemo();
		demo.greetUser("Darshan");
		demo.dispNum(50);
		
	}

}
