import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class Progarm_to_find_array_are_same {
    public static boolean issame(int[] a,int []b)
    {
       int n=a.length,m=b.length;
       if(m!=n)
       {
        return false;
       }
       int count=0;
       HashMap<Integer,Integer> h=new HashMap<>();
       for(int i=0;i<n;i++)
       {
        if((h.get(a[i])==null))
        {
            h.put(a[i], 1);
        }
        else{
          count=h.get(a[i]);
          count++;
          h.put(a[i], count);  
        }
       
       }
       for(int i=0;i<n;i++)
       {
        if(!h.containsKey(b[i]))
        {
            return false ;
        }
        if(h.get(b[i])==0)
        {
            return false;
        }
        count=h.get(b[i]);
        count--;
        h.put(b[i],count);
       }
       return true;


    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,5};
        int[]b={5,4,3,3,2,1};
        if(issame(a,b))
        {
            System.out.println("the array are equal");
        }
        else{
            System.out.println("the array are not hte same!!");
        }
    }
}
