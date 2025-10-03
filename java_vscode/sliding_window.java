import java.util.Scanner;

public class sliding_window {
    public static void window(int [] a,int k,int n)
    {
        int max_sum=0;
        for(int i=0;i<k;i++)
        {
            max_sum+=a[i];
        }
        int win_sum=max_sum;
        for(int i=k;i<n;i++)
        {
            win_sum+=a[i]-a[i-k];
            max_sum=Math.max(max_sum, win_sum);

        }
        System.out.println(" The sub arrye with the largest sum is : "+max_sum);

    }
    public static void main(String[] args) {
        {
            System.out.println("Enter the size of the array :");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int [] a= new int[n];
            System.out.println("Enter the elements to the array :");
            for(int i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            int k=3;
            window(a,k,n);
        
        }
    }
}
