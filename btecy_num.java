public class btecy_num {

    public static void main(String[] args) {
        //int num=123;
        int sum=0;
        for(int i=8;i<=19;i++)
        {

            if(isbtecy(i))
            {
                //System.out.println("True");
                sum=sum+i;
                System.out.println("sum of="+sum);
            }
            /*else{
                System.out.println("False");
            }*/
        }
        
        
    }
    public static boolean isbtecy(int num)
    {
        while(num>10)
        {
            int last=num%10;
            int pre=(num/10)%10;
            int total=last-pre;
            
            if(check(total)!=1)
                return false;
            num=num/10;
        }
        return true;
    }

    public static int check(int n)
    {
        return n==1||n==-1?1:0;
    }

    
}
