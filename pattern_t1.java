import java.util.Scanner;
class  prime
{
static Scanner sc=new Scanner(System.in);
public static void main(String[] args)
{
System.out.print("Enter the num:");
int num=sc.nextInt();
int count=0;
for (int i=1;num>=i ;i++ )
{
if(num%i==0)
{
count++;
}

}
if(count==2)
{
System.out.println(num+" is prime number");
}
else if(num==0)
{
System.out.println(num+" is neither prime number nor composite number");
}
else
{
System.out.println(num+" is not a prime number");
}

}
}
