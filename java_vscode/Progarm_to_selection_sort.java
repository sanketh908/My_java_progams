import java.util.Scanner;

public class Progarm_to_selection_sort {
    public static void selectionsort(int n,int []a)
    {
        for(int i=0;i<n-1;i++)
        {
           int smallest=i;
           for(int j=i+1;j<n;j++)
           {
            if(a[smallest]>a[j])
            {
                smallest=j;
            }
            
           }
           if(a[smallest]!=a[i])
            {
            int temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
            }
        }
        System.out.println("The sorted array is :");
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
        selectionsort(n,a);       
    }
    
}
