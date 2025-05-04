import java.util.Scanner;
import java.util.Arrays;
class program1 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter size:");
		int size=sc.nextInt();
		solve(size);
	}
	public static void solve(int size)
	{
		int[]a=new int[size];
		for (int i=0;i<a.length;i++ )
		{
			System.out.print("enter "+"a["+i+"]");
			a[i]=sc.nextInt();
		}
		//System.out.print(Arrays.toString(a));
		for (int i=0;i<size ;i++ )
		{
			System.out.println(a[i]);
		}
	}

}
