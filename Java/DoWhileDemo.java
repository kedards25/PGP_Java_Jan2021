//java imports java.lang package by default
//so we need not to import it manually
class DoWhileDemo
{
	public static void main(String[] args)
	{
	//code will execute atleast once irrespective of condition
		int i=0;
		do
		{
			System.out.println(i);
			//code to perform
			i++;
		}while(i<=10);
	}
}
