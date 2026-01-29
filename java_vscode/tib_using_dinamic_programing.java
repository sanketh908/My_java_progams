import java.util.HashMap;
import java.util.Scanner;

public class tib_using_dinamic_programing {
    public static int tib (int n)
    {

     return tib(n,new HashMap<Integer,Integer>());   
    }
    public static int tib (int n, HashMap<Integer ,Integer> memo)
    {
        if(n==0|| n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        if(memo.containsKey(n))
        {
            return memo.get(n);
        }
        else{
            int result = tib(n-1,memo)+tib(n-2,memo)+tib(n-3, memo);
            memo.put(n,result);
            return result;
        }


    }
    public static void main(String[] args) {
         System.out.println("ENter the number :");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(" "+tib(n));
        in.close();
    }
}
