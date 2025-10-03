import java.util.Scanner;

public class Print_butterfuy 
{
public static void main(String[] args) {
    System.out.println("Enter the number of rows :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int space =2*n-1,stare=0;
    for(int i=1;i<=2*n-1;i++)
    {
       if(i<=n)
       {
         space=space-2;
         stare++;
       }
       else{
        space=space+2;
        stare--;
       }
       for(int j=1;j<=stare;j++)
       {
        System.out.print(" *");
       }
       for(int k=1;k<=space;k++)
       {
        System.out.print("  ");
       }
       for(int s=1;s<=stare;s++)
       {
        if(s!=n)
        {
        System.out.print(" *");
        }
       }
       System.out.println("");
    }
}    
}
