package com.learning.enumimplementation;

enum Colors{Red,Green,Blue,Orange,White,Gray}

public class EnumImplementation {

	void showColor(Colors color)
	{
		switch(color)
		{
			case Red:
				System.out.println("You chose Red color");
				break;
			case Green:
				System.out.println("You chose Green color");
				break;
			case Blue:
				System.out.println("You chose Blue color");
				break;
			case Orange:
				System.out.println("You chose Orange color");
				break;
			case White:
				System.out.println("You chose White color");
				break;
			case Gray:
				System.out.println("You chose Gray color");
				break;
		
		}
	}
	
	public static void main(String[] args) {
		
		EnumImplementation enumImplementation=new EnumImplementation();
		enumImplementation.showColor(Colors.Blue);
	}

}
