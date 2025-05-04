class new1 {
    public static void main(String[] args) {

        int []a={2,4,6,8,10};
        int max=Integer.MIN_VALUE;//-infinite
        int sec_max=Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(" Frst Max num="+max);
        for(int i=0;i<a.length;i++)
        {
            if(max!=a[i]&&sec_max<a[i])
            {
                sec_max=a[i];
            }
            
        }
        System.out.println("Second max="+sec_max);


    }
    
}
