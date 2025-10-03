import java.util.Scanner;

public class matrix_addition {
    public static void main(String[] args) {
        System.out.println("Enter the matrix size M:");
        Scanner in =new Scanner(System.in);
       int  m=in.nextInt();
       System.out.println("Enter ht size of the matrix :");
       int n=in.nextInt();
       int [][] a=new int[m][n];
       int [][] b=new int[m][n];
       System.out.println("Enter the elemnts to the arrya A:");
       int [][] sum=new int [n][m];
       int [][] sub=new int [n][m];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            a[i][j]=in.nextInt();
        }
       }
       System.out.println("Enter the elemnts to the arrya B:");
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            b[i][j]=in.nextInt();
        }
       }
        for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            sum[i][j]=a[i][j]+b[i][j];
            sub[i][j]=a[i][j]-b[i][j];
        }
       }
       System.out.println("the sum of two matrix :");
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
           System.out.print(sum[i][j]);
        }
        System.out.println("");
       }
       
       System.out.println("the sub of two matrix :");
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
           System.out.print(sub[i][j]);
        }
        System.out.println("");
       }
       

    }
    
}
