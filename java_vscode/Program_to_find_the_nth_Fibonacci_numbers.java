import java.util.Scanner;

public class Program_to_find_the_nth_Fibonacci_numbers {
    public  static int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        else
        {
        return (fib(n-1)+fib(n-2));
        }
    }
 public static void main(String[] args) {
    System.out.println("Enter the nth value to be found in the Fibonacci seris :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println("the nth Fibonacci numbers is :"+fib(n));
 }   
}
