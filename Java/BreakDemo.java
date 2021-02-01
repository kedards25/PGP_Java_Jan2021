class BreakDemo
{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=1;i<10;i++)
		{
			if(i%3==0)
			{
				System.out.println("Breaking the Loop");
				break;
			}
			System.out.println("incrementing num Within Loop");
			num++;
			
		}
		System.out.println("displaying num after the Loop "+num);
	}
}