import java.util.Scanner;
import java.util.HashMap;

public class fib_using_dinamic_programing {
    public static int fib (int n)
    {
      return  fib(n,new HashMap<Integer,Integer>());

    }
  public static int fib(int n,HashMap<Integer,Integer> memo)
  {
     if(n==0 || n==1)
     {
        return n;
     }
     if(memo.containsKey(n))
     {
        return memo.get(n);
     }
     else
     {
       int result =  fib(n-1,memo)+fib(n-2,memo);
        memo.put(n,result);
        return result;
     }
  }


    public static void main(String[] args) {
        System.out.println("ENter the number :");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(" "+fib(n));
        in.close();
    }
}
