import java.util.Scanner;

public class Find_the_largest_sub_arry 
{
    static int find_large(int []arr)
    {
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                sum+=arr[i];
            }
            else
            {
                sum=arr[i];
            }
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the arry elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("The largest array :"+ find_large(arr));
    }
    
}
