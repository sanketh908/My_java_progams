import java.util.Scanner;

public class Program_to_find_the_secound_largest_number_in_a_array {
    public static int largestelement(int n,int[] a)
    {
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            } 
        }
         return max;
    }
    public static int secoundlargest(int n,int [] a)
    {
        int max=a[0];
        int largset=largestelement(n, a);
        for(int i=0;i<n;i++)
        {
            if(max<a[i]&&a[i]!=largset)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of thje array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the elements to hte araay :");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("The largest element is ="+largestelement(n,a)+"+The secound largest element is="+secoundlargest(n,a));

    }
    
}
