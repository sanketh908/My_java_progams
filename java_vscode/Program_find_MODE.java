import java.util.Scanner;

public class Program_find_MODE 
{
   static int findmode(int[] a,int n)
    {
        
        int max=a[0];
        for(int  i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
            int [] count =new int[max+1];
            for(int i=0;i<max+1;i++)
            {
                count[i]=0;
            }
            for(int i=0;i<n;i++)
            {
                count[a[i]]++;
            }
            int k=count[0];
            int mode=0;
            for(int i=1;i<max+1;i++)
            {
                if(count[i]>k)
                {
                    k=count[i];
                    mode=i;
                }
            }
          return mode;
        
    }
    public static void main(String[] args) {
        System.out.println("ENter the size of the array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the elements to thte array :");
        int [] a=new int [n];
        for(int i=0;i<n;i++)
        {
        a[i]=in.nextInt();

        }
        int mode=findmode(a,n);
        System.out.println("mode is :"+mode);
    }
    
}
