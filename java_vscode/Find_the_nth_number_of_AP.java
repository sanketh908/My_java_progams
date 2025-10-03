import java.util.Scanner;

public class Find_the_nth_number_of_AP 
{
        static int AP(int a1,int a2,int n)
    {
        return (a1+(n-1)*(a2-a1));
    }
    public static void main(String[] args) {
        System.out.println("Enter the fist value of the AP :");
        Scanner in=new Scanner(System.in);
        int a1=in.nextInt();
        System.out.println("Enter the secound number of the AP :");
        int a2=in.nextInt();
        System.out.println("Enter the nth number to be found in the AP :");
        int n=in.nextInt();
       int ans = AP(a1,a2,n);
       System.out.println(ans);
    }
    
}
