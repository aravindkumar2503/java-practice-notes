class comp_1
{
    public static void main(String[] args) {
        int []a={-8,3,5,-6,2};
        int k=2;
        int sum=0;
        for(int i=0;i<=a.length-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                if(a[j]<0)
                {
                    sum=sum+a[j];
                }
            }
        }
        System.out.println("Total="+sum);
    }
}