import java.util.HashSet;

public class Program_to_find_disjoint_in_two_array {
    public static boolean finddisjoint(int []a,int [] b)
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i:a)
        {
            h.add(i);

        }
        for(int i:b)
        {
            if(h.contains(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int []b={7,8,4};
        if(finddisjoint(a,b))
        {
            System.out.println("a is a disjoint of b!!");

        }
        else
        {
            System.out.println("a is not  disjoint of b!!");
        }
    }
}
