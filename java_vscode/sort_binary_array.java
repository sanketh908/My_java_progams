import java.util.Scanner;

public class sort_binary_array 
{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int [n+1];
        System.out.println("Enter the number to the array");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]<1)
            {
                j++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        System.out.println("The sorted array is :");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
