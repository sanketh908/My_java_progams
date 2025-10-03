import java.util.Scanner;

public class Progarm_to_find_the_missing_element_in_the_array {
    public static int findmissing(int n,int [] a)
    {
        int expeacted_sum=(n*(n+1))/2;
        int actual_sum=0;
        for(int i:a)
        {
            actual_sum+=i;
        }
        return expeacted_sum-actual_sum;

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the arrya :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n-1];
        System.out.println("Enter hte elements to the array :");
        for(int i=0;i<n-1;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("the missing element is "+findmissing(n,a));
    }
    
    
}
