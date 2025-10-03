import java.util.Scanner;

import javax.xml.transform.stax.StAXResult;

public class tower_of_hanio 
{
 
static void  tower_of_hanio_function(int n,String s,String h,String d)
   {
        if(n==1)
        {
            System.out.println("treansfer disk "+n+" from "+s+" to "+d);
            return;
        }
        tower_of_hanio_function(n-1, s, d, h);
        System.out.println("trensfer disk "+n+" from "+s+" to "+d);
        tower_of_hanio_function(n-1, h, s, d);
    }
   public static void main(String [] args)
   {
    System.out.println("Enter the number of disk :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    tower_of_hanio_function(n,"soures","helper","destination");
    in.close();
   } 
   
}
