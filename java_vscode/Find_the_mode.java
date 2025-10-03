import java.util.HashMap;

public class Find_the_mode {
      public static  void  findfqr(int [] a)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
       for(int i:a)
       {
        if(h.containsKey(i))
        {
          count=h.get(i);
          count++;
          h.put(i,count);
        }
        else{
            h.put(i, 1);
        }
       }
       System.out.println(h);
    }

       
    public static void main(String[] args) {
        int []a={1,1,1,2,2,2,4,4,4,4,4,4,4};
       findfqr(a);
    }
}
