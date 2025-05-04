import java.util.Scanner;
class pattern_demo 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter n:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++ )
		{
			for (int j=0;j<n;j++)
			{
				if(i>=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i=0;i<n;i++ )
		{
			for (int j=0;j<n;j++)
			{
				if(i+j<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
	*
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/

