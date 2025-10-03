public class Program_to_find_the_count_of_number_of_1_a_arrya {
    public static int find1(int [] a)
    {
        int n=a.length;
        int low =0,hi=n-1;
        while (low <=hi) {
            int mid =hi+low/2;
            if(a[mid]== 0)
            {
                hi=mid-1;

            }
            else if(mid ==n-1 || a[mid+1]!=1)
            {
                return mid +1 ;

            }
            else 
            {
              low =mid +1;
            }
            
        }
        return 0;

    }
    public static void main(String[] args) {
        int [] a={1,1,1,1,1,0,0,0,0,};
        System.out.println(find1(a));
    }
    
}
