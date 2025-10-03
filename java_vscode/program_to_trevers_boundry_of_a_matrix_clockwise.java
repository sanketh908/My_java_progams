import java.util.ArrayList;
import java.util.Scanner;

public class program_to_trevers_boundry_of_a_matrix_clockwise {
   static ArrayList<Integer> treves(int mat[][])
   {
    int m=mat[0].length;
    int n=mat.length;
    ArrayList<Integer> res=new ArrayList<>();
    for(int j=0;j<m;j++)
    {
        res.add(mat[0][j]);
    }
    for(int i=1;i<n;i++)
    {
        res.add(mat[i][m-1]);
    }
    for(int j=m-2;j>0;j--)
    {
        res.add(mat[n-1][j]);
    }
    for(int i=n-1;i>0;i--)
    {
        res.add(mat[i][0]);
    }
    return res;
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
        System.out.println("the treversed array is :");
        ArrayList<Integer> res =treves(a);
        for(int i:res)
        {
            System.out.print(i);
        }
    }
    
}
