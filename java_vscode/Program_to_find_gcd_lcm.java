import java.util.Scanner;

public class Program_to_find_gcd_lcm {
    public static int  gcd(int a,int b)
    {
        while (b!=0) {
       int temp=b;
        b=a%b;
        a=temp;           
        }
        return a;

    }
   public static void main(String[] args) {
    System.out.println("enter the values for a: ");
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    System.out.println("ENter the values for b:");
    int b=in.nextInt();
    int gcd=gcd(a,b);
    int lcm=(a*b/gcd);
    System.err.println("the GCD is :"+gcd);
    System.out.println("the LCM is :"+lcm);
   } 
    
}
