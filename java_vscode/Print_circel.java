import java.util.Scanner;
import java.math.*;

public class Print_circel 
{
   static void circel(int r)
    {
        double dist;
        for(int i=0;i<=r*2;i++)
        {
            for(int j=0;j<=r*2;j++)
            {
                dist=Math.sqrt((i-r)*(i-r)+(j-r)*(j-r));
                if(dist>r-0.5 &&  dist <r+0.5  )
                {
                    System.out.print(" *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the radius :");
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        circel(r);
    }
    
}
