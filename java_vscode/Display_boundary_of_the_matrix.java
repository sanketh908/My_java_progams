import java.util.Scanner;

public class Display_boundary_of_the_matrix {
    static void find_bound(int [][] a)
    {
      int n=a[0].length;
      int m=a.length;
      System.out.println("enter reavtangle :");
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
            if(i==0||j==0||i==n-1||j==m-1)
            {
                System.out.print(" "+a[i][j]);

            }
            else
            {
                System.out.print("  ");
            }
           
        }
         System.out.println(" ");
      }  
    }
    public static void main(String[] args) {
          System.out.println("Enter the sixe of the row :");
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        System.out.println("Enter the size of the colume :");
        int c=in.nextInt();
        System.out.println("Enter the elements to the matrix:");
        int [][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        find_bound(a);
    }
    
}
