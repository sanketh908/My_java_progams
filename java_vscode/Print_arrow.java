import java.util.Scanner;

public class Print_arrow 
{
    static void pattan(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=0;i--)
        {
         for(int j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=0;k--)
            {
                System.out.print("*");
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
