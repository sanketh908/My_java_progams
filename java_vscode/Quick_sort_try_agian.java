import java.util.Scanner;

public class Quick_sort_try_agian {
    public static int returnpivitindex(int []a ,int low,int hi)
    {
        int pivit=a[hi];
        int indx=low-1;
        for(int j=low;j<hi;j++)
        {
            if(a[j]<pivit)
            {
                indx++;
                int temp=a[j];
                a[j]=a[indx];
                a[indx]=temp;

            }

        }
        indx++;
        int temp=pivit;
                pivit=a[indx];
                a[indx]=temp;

                return indx;
    }
    public static void quicksort(int []a,int low,int hi)
    {
       if(low<hi)
       {
         int pivit=returnpivitindex(a,low,hi);
        quicksort(a, low, pivit-1);
        quicksort(a, pivit+1, hi);
       }
    }
   public static void main(String[] args) {
    System.out.println("Enter the size of the array :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println("Enter the elements to hte array :");
    int []a =new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    quicksort(a,0,n-1);
    for(int i:a)
    {
        System.out.print(i+",");
    }
   }
}
