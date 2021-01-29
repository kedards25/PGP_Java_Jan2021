class SwitchDemo
{
	public static void main(String[] args)
	{
		int val=2;
		switch(val)
		{
		case 1:
			System.out.println("East");
			break;

		case 2:
			System.out.println("West");
			break;

		case 3:
			System.out.println("North");
			break;

		case 4:
			System.out.println("South");
			break;
		
		default:
			System.out.println("invalid input");
		}
	}
}