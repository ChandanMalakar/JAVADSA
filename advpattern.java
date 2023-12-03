class butterflypattern{
    public static void main(String args[])
    {
        int i,j,n=4;
        for(i=1;i<=n;i++)
        {
                for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                int sp=2*(n-i);
                for(int k=1;k<=sp;k++)
                {
                    System.out.print(" ");
                }
                for(int l=1;l<=i;l++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
        for(i=n;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            int sp=2*(n-i);
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}