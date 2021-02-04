package com.learning.encapsulationdemo;

class Demo
{
	//in order to achieve encapsulation
	//We should not give access of variables
	//outside the class
	//instead declare variables private and 
	//methods to access variables public
	private int val;
	
	//private int val;
	//private int val2;
	//private int val3;
	//private int val4;
	
//	public Demo(val,val2,val3,val4) {
//		// TODO Auto-generated constructor stub
//	}
	
	public void setVal(int x)
	{
		val=x;
	}
	
	public int getVal()
	{
		return val;
	}
	
}

public class EncapsulationDemo {
	
	Demo demo=new Demo();
//	Demo demo=new Demo(7,6,1,3);
	
	void dispVal()
	{
		demo.setVal(10);
		int receivedVal=demo.getVal();
		//System.out.println("Value from other class "+demo.getVal());
		System.out.println("Value from other class "+receivedVal);
	}
	
	public static void main(String[] args) {
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.dispVal();

	}

}
