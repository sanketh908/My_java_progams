import java.util.Scanner;

public class Progam_to_quick_sort {
    public static int returnpivit(int []a,int low ,int hi)
    {
        int indx=-1;
        int pivit=a[hi];
        for(int j=0;j<hi;j++)
        {
            if(a[j]<=pivit)
            {
                indx++;
                int temp=a[indx];
                a[indx]=a[j];
                a[j]=temp;
            }
        }
        indx++;
   
                int temp=a[indx];
                a[indx]=a[hi];
                a[hi]=temp;
                return indx;
        
        
    }
    public static void  quicksort(int [] a,int low ,int hi)
    {
        if(low <hi)
        {
            int pivit=returnpivit(a,low,hi);
            quicksort(a, low, pivit-1);
            quicksort(a, pivit+1, hi);

        }
    }
    public static void main(String[] args) {
     System.out.println("Enter the size of the array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the Elements to the array :");
        int [] a=new int[n];
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
