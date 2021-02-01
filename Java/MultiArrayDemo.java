
class MultiArrayDemo
{
	//array is used to refer to multiple values
	//using a single variable
	public static void main(String[] args)
	{
		int [][] arr=new int[2][2];
		int [][] arr2={
				{5,5},
				{68,7}
			      };
		int [][] arr3=new int[][]{
				{5,5},
				{68,7}
			      };
		int [][]arr4=new int[2][2];
		arr4[0][0]=25;
		arr4[0][1]=84;
		arr4[1][0]=74;
		arr4[1][1]=56;

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr4[i][j]+"\t");
			}
			System.out.println("\n");
		}
	
	}
}
