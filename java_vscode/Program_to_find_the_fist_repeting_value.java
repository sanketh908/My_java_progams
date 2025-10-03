import java.util.ArrayList;
import java.util.Scanner;

public class Program_to_find_the_fist_repeting_value {
    public static ArrayList<Integer> arr=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Enter the size of the array :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the elemets yo the array :");
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            arr.add(a[i]);
        }
        for(int i:arr)
        {
            if(arr.contains(i))
            {
                System.out.println("the element is"+i);
                break;
            }
        }



    }
    
}
