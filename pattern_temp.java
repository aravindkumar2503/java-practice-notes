import java.util.Scanner;
class  pattern_temp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Entere n:");
		int n=sc.nextInt();
		int k=0;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<=i;j++)
			{
				//if((i>=n/2))
				//{
					System.out.print(++k+"\t");
				//}
				//else
				//{
					//System.out.print("  ");
				//}
			}
			System.out.println();
		}
	}
}
