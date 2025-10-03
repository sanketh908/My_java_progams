import java.util.Scanner;

public class transpose_of_a_matrix {
    public static void main(String[] args) {
        System.out.println("ENter the size of row :");
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        System.out.println("Enter the size of the columns :");
        int c=in.nextInt();
        int [][] a=new int[r][c];
        System.out.println("ENter the elemnts to the array :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("the original  arrya is :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("the transpose of the arrya is :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
