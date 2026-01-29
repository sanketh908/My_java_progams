public class Index_of_sub_array_sum {
    public static void main(String[] args) {
        int []arr={1,2,3,7,5};
        int target=12;
       System.out.println(indexofsubarraysum(arr,arr.length,target));
    }
    public static String indexofsubarraysum(int[] arr ,int n,int target)
    {
        int sum=0;
        int i=0;
        int j=0;
        while (sum!=target) {
          if(sum<target)
            {
                sum+=arr[j];
                j++;
            }  
            if (sum>target) {
                sum-=arr[i];
                i++;
            }
            if (sum==target) {
                return(" result "+i+" "+j);
                
                
            }
        }
        return (" result "+i +" "+j);
        
    }
}
