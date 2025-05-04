class pattern_t2 {
    public static void main(String[] args)
    {
        int n=7;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)//box-1
            {
                if(((n-1==j&&n-4==i)||(n-1==j&&n-3==i)||(n-1==j&&n-2==i)||(n-1==j&&n-1==i))||((j==0&&n-4==i)||(0==j&&n-3==i)||(0==j&&n-2==i)||(0==j&&n-1==i))||(i==0&&j==n/2)||(i==1&&j==1)||(i==1&&j==5)||(i==2&&j==0)||(i==2&&j==6)||(i==4))
                {
                    System.out.print("A ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-2
            {
                if(j==0||i==0||(j==n-1&&i==0)||(j==n-1&&i==1)||(j==n-1&&i==2)||(j==n-1&&i==3)||(j==n-1&&i==4)||(j==n-2&&i==n-3)||(i==j&&j==n-1)||(j==3&&i==4)||(j==4&&i==4)||(j==5&&i==5)||(i==n-3&&j==1)||(i==n-3&&j==2))
                {
                    System.out.print("R ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-3
            {
                if(((n-1==j&&n-4==i)||(n-1==j&&n-3==i)||(n-1==j&&n-2==i)||(n-1==j&&n-1==i))||((j==0&&n-4==i)||(0==j&&n-3==i)||(0==j&&n-2==i)||(0==j&&n-1==i))||(i==0&&j==n/2)||(i==1&&j==1)||(i==1&&j==5)||(i==2&&j==0)||(i==2&&j==6)||(i==4))
                {
                    System.out.print("A ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-4
            {
                if(((j==0&&i==0)||(j==0&&i==1)||(j==0&&i==2)||(j==0&&i==3))||(n-1==j&&i==0)||(n-1==j&&i==1)||(n-1==j&&i==2)||(n-1==j&&i==3)||(j==1&&i==4)||(j==n-2&&i==4)||(j==2&&i==5)||(j==n-3&&i==5)||(i==n-1&&j==n/2))
                {
                    System.out.print("V ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-5
            {
                if(i==0||i==n-1||j==3)
                {
                    System.out.print("I ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-6
            {
                if(j==0||i==j||j==n-1)
                {
                    System.out.print("N ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for(int j=0;j<n;j++)//box-7
            {
                if(j==1||i==0||j==n-1||i==n-1)
                {
                    System.out.print("D ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
       
    }