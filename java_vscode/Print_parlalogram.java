import java.util.Scanner;

public class Print_parlalogram {
     static void pattan(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(2*n);j++)
            {
                if(i>(n-j+1))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                if((i+n)>j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=(n*2);j++)
            {
                if(i<j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
                if(i<=((2*n)-j))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattan(n);

        
    }
}
