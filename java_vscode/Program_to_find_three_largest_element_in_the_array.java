import java.util.ArrayList;
import java.util.Scanner;

public class Program_to_find_three_largest_element_in_the_array {
     public static ArrayList<Integer> arr=new ArrayList<>();
      public static void largestelement(int n,int[] a)
    {
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            } 
        }
        if(!arr.contains(max))
        {
        arr.add(max);
        }
       

    }
    public static void secoundlargest(int n,int [] a)
    {
        int max=a[0];
        largestelement(n, a);
        for(int i=0;i<n;i++)
        {
            if(max<a[i]&&!arr.contains(a[i]))
            {
                max=a[i];
            }
        }
        if(!arr.contains(max))
        {
        arr.add(max);
        }
       
    }
    public static void threedlargest(int n,int [] a)
    {
        int max =a[0];
        largestelement(n, a);
        secoundlargest(n, a);
        for(int i=1;i<n;i++)
        {
            if(a[i]>max&&!arr.contains(a[i]))
            {
                max=a[i];
            }
        }
        if(!arr.contains(max))
        {
        arr.add(max);
        }
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
        threedlargest(n,a);
        System.out.println(arr);
        
}
    
}
