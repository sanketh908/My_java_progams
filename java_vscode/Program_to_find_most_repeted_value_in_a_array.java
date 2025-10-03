import java.util.HashMap;
import java.util.Iterator;

public class Program_to_find_most_repeted_value_in_a_array {
    public static  void  findfqr(int [] a)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        for(int i:a)
        {
            if(h.get(i)==null)
            {
                h.put(i, 1);
            }
            else
            {
                count=h.get(i);
                count++;
                h.put(i, count);
            }
        }
        int max=0,index=0;
        for(int i=0;i<a.length;i++)
        {
           count = h.get(a[i]);
           if(max<count)
           {
            max=count;
            index=a[i];
           }
        }
        System.out.println("The most repeted value is"+index+" and it has occeard "+count);
    }

       
    public static void main(String[] args) {
        int []a={1,1,1,2,2,2,4,4,4,4,4,4,4};
       findfqr(a);
    }
}
