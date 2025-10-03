import java.util.Scanner;

public class Print_rombus 
{
 public static void main(String[] args) {
    System.out.println("Enter hte number of rows :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int space1=n-1,space=n-1;

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=space1;j++)
        {
            System.out.print("  ");
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(" *");
        }
        System.out.println("");
        space1--;
    }
    System.out.println("");
    System.out.println("");
      for(int i=0;i<n;i++)
    {
        for(int j=0;j<=space;j++)
        {
            System.out.print("  ");
        }
        for(int k=0;k<n;k++)
        {
            if(k==0||k==n-1||i==0||i==n-1)
            {
                System.out.print(" *");
            }
            else
            {
                System.out.print("  ");
            }
        }
        System.out.println("");
        space--;
    }
 }   
}
