import java.util.Scanner;

public class Program_to_perform_merg_sort {
    public static void  dived(int []a ,int low,int hi)
    {
      if (low <hi)
       {
        int mid =(low +hi)/2;
        dived(a, low,mid);
        dived(a, mid+1, hi);
        sort(a,low,mid,hi);
        
      }
      
    }
    public static void sort(int []a,int low,int mid ,int hi)
    {
        int [] mearg =new int[hi-low+1];
        int indx1=low;
        int indx2=mid+1;
        int indx=0;
        while (indx1<=mid && indx2<=hi) {
            if(a[indx1]<a[indx2])
            {
                mearg[indx]=a[indx1];
                indx1++;indx++;
            }
            else{
                mearg[indx]=a[indx2];
                indx2++;indx++;
            }
            
            
        }
        while (indx1<=mid) {
                mearg[indx]=a[indx1];
                indx1++;indx++;
                
            }
            while (indx2<=hi) {
                 mearg[indx]=a[indx2];
                indx2++;indx++;
            }
           
        for(int i=0,j=low;i<mearg.length;i++,j++)
        {
            a[j]=mearg[i];
           

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
        int low=0;
        int hi=n-1;
       dived(a,low,hi);
       for(int i:a)
        {
            System.out.print(i+",");
        }
             
    } 
}
