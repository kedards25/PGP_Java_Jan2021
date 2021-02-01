//java imports java.lang package by default
//so we need not to import it manually
class IfDemo
{
	/*public static void main(String[] args)
	{
		int val=5;
		if(val>7)
		{
			System.out.println(val+" is greater than 7");	
		}
		else
		{
			System.out.println(val+" is lesser than 7");	
		}
	}*/

	public static void main(String[] args)
	{
		//if we have one statement belonging to if or else 
		//block then {} can be eliminated
		int val=5;
		if(val>7)
			System.out.println(val+" is greater than 7");	
		else
			System.out.println(val+" is lesser than 7");	

	}
}
