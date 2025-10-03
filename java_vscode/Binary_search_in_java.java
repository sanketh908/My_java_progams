import java.util.Scanner;

public class Binary_search_in_java 
{
   static int Binary_search(int [] a,int n,int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        else
        {
           int mid =(low+high)/2;
           if(a[mid] == n)
           {
            return mid; 
           }
           else if(a[mid]<n)
           {
           return Binary_search(a,n,low,mid-1);
           }
           else
           {
           return Binary_search(a, n,mid+1, high);
           }
        }
    }
 public static void main(String[] args) {
    System.out.println("Enter the size of the array :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println("Enter the Elements to the array :");
    int [] a=new int [n];
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    System.out.println("Enter the element to be serched :");
    int serch=in.nextInt();
    int low=0,high=n-1;
    int ans = Binary_search(a,serch,low,high);
    ans+=1;
    System.out.println(" the element is at "+ans+"position");
}   
}
