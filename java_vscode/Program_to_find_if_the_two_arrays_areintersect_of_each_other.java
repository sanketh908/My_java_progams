import java.util.ArrayList;
import java.util.HashSet;

public class Program_to_find_if_the_two_arrays_areintersect_of_each_other {
    public static void findintersect(int[] a,int[] b)
    {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int n:a)
        {
            h.add(n);
        }
        for(int n:b)
        {
            if(h.contains(n))
            {
                res.add(n);
                h.remove(n);
            }
        }
        System.out.println("the number which are bothin array A and array B are "+res);
    }
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,8,6};
        int[] b={1,2,3,5,3,2,8};
        findintersect(a,b);
    }
}
