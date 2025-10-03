import java.util.Scanner;

public class Program_to_bubble_sort {
    public static void bubblesort(int n,int [] a)
    {
        for(int i=0;i<n-1;i++)
        {
           for(int j=0;j<n-i-1;j++)
           {
            if(a[j]>a[j+1])
            {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
           } 
        }
        System.out.println("the sorted array is ");
        for(int i:a)
        {
            System.out.println(i);
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
        bubblesort(n,a);
    }
}
