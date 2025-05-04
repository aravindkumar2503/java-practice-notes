import java.util.Scanner;
class pattern_exercise_1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter n:");
		int n=sc.nextInt();
		
		for (int i=0;i<n ;i++ )
		{
			int a=1;
			for(int j=0;j<n;j++)
			{
				if(i<=j)
				{
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
			//start++;
		}
		
	}
}
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

