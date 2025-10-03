import java.util.Scanner;

public class Program_to_Insertion_sort {
    public static void insertionsort(int n,int [] a)
    {
        for(int i=1;i<n;i++)
        {
            int current=a[i];
            int j=i-1;
            while(j>=0&& a[current]<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=a[current];

        }
        System.out.println("the sorted array is :");
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
       insertionsort(n,a);       
    }
    
}
