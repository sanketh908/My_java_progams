import java.util.HashMap;

public class Program_to_find_max_distance_between_two_occurrences {
    public static int finddis(int [] a)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            if(!h.containsKey(a[i]))
            {
                h.put(a[i],i);
            }
            else{
                res=Math.max(res,i-h.get(a[i]));
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int []a={1,2,2,3,4,2,1};
        System.out.println("the max distece between two occurences is:"+finddis(a));
    }
}
