public class new2 {
    public static void main(String[] args) {
        int []a={2,20,30,40,50};
        int max=Integer.MIN_VALUE;
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                sec_max=max;
                max=a[i];
            }
        }
        System.out.println("First max="+max);
        if(sec_max==Integer.MIN_VALUE)
        {
            System.out.println("No second max array should be duplicated values");
        }
        else
        {
            System.out.println("second max="+sec_max);
        }
        
    }
    
}
