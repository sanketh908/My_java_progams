import java.util.HashSet;

public class Program_to_check_whether_the_arrya_is_a_sub_string_of_other {
    public static boolean issubstring(int [] a,int [] b)
    {
        HashSet<Integer> h=new HashSet<>();
        for(int i:a)
        {
            h.add(i);
        }   
        for(int i:b)
        {
            if(!(h.contains(i)))
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6};
        int []b={1,8,6};
        if(issubstring(a,b))
        {
            System.out.println("the array b is a sub string of b");

        }
        else{
            System.out.println("the array b is not a sub string of b");
        }
    }
}
