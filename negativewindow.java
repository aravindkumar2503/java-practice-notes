public class negativewindow {

    public static void main(String[] args) {
        int []a={-8,3,5,-6,2};
        int in=2;
        int sum=0;
        int st=0,end=a.length-in;
        for(int i=0;i<=a.length-in;i++)
        {
            int j=i;
            int k=j+in;
            while(j<k)
            {
                if(a[j]<0)
                {
                    sum=sum+a[j];
                }
                j++;
            }
        }
        /*for(int i=0;i<=a.length-in;i++)
        {
            for(int j=i;j<i+in;j++)
            {
                if(a[j]<0)
                {
                    sum=sum+a[j];
                }
            }
        }*/
        System.out.println(sum);
    }
    
}
