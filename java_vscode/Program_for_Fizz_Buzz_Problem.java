import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program_for_Fizz_Buzz_Problem {
    public static ArrayList<String> buss(int n)
    {
        ArrayList<String> s=new ArrayList<>();
        HashMap<Integer,String> h=new HashMap<>();
        h.put(3,"fuzz");
        h.put(5, "buzz");
        int [] d={3,5};
        StringBuilder str=new StringBuilder();
        for(int i=1;i<n;i++)
        {
            for(int m:d)
            {
                if(i%m==0)
                {
                    str.append(h.get(d));
                }
            }
             if(str.length()==0)
               {
                str.append(i);

               }
               s.add(s.toString());     
        }
        return s;

    }
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        ArrayList<String> a=buss(n);
        for(String s:a)
        {
            System.out.println(s);
        }
    }
    
}
