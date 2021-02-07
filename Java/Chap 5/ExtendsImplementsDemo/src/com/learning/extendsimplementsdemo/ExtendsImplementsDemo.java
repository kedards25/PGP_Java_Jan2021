package com.learning.extendsimplementsdemo;

interface DemoP
{
	void show();
}
class DemoP2
{
	void disp()
	{
		System.out.println("Welcome from DemoP2");
	}
}
public class ExtendsImplementsDemo extends DemoP2 implements DemoP {

	@Override
	public void show() {
		System.out.println("Overidden method from Interface");
	}
	
	public static void main(String[] args) {

		ExtendsImplementsDemo demo=new ExtendsImplementsDemo();
		demo.show();
		demo.disp();
		
	}

	

}
