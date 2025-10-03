import java.util.HashSet;

public class Program_to_find_union_of_two_arrays {
    public static void findunion(int[] a,int[] b)
    {
        HashSet<Integer> h=new HashSet<>();

        for(int n:a)
        {
            h.add(n);
        }
        for(int n:b)
        {
            h.add(n);
        }
        System.out.println(h);
    }
   public static void main(String[] args) {
    int []a ={1,2,3};
    int []b={4,5,6,6,6,6};
    findunion(a,b);
   } 
    
}
