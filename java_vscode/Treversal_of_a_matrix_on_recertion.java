public class Treversal_of_a_matrix_on_recertion {
    public static void trevers(int m[][],int i,int j)
    {
        if(i==m.length&&j==m[0].length )
        {
            System.out.println(m[i][j]);
            return;
        }
        System.out.println(m[i][j]);
        if(j<m[0].length-1)
        {
            trevers(m, i, j+1);
        }
        else if (i<m.length-1) {
            trevers(m, i+1, 0);
            
        }

    }
    public static void main(String[] args) {
         int [][] m={{1,2,3},{4,5,6},{7,8,9}};
         trevers(m,0,0);
    }
    
}
