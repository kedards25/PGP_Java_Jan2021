class CentimeterDemo
{
	public static void main(String[] args)
	{
		int mtr, cms, kms;
		mtr=Integer.parseInt(args[0]);
		cms=mtr*100;
		kms=mtr*1000;
		System.out.println("Answer is" + cms+" and "+kms);
	}
}
