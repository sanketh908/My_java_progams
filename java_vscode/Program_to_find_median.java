import java.util.Scanner;

public class Program_to_find_median {
    public static void median(int [] a,int n)
    {
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            max++;
            int [] m=new int[max];
            for(int i=0;i<max;i++)
            {
                a[i]=0;
            }
            

        }
    }
    public static void main(String[] args) {
      System.out.println("Enter the size of the array :");
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int [] a=new int[n];
      System.out.println("Enter the elements to the array :");
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }  
      median(a,n);
    }
}
