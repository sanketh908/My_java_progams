import java.util.Scanner;

public class search_in_matrix {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows the array :");
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        System.out.println("Enter the number of rows the array :");
        int c=in.nextInt();
        int [][] a=new int[r][c];
        System.out.println("Enter the elemnts to the array :");
        for(int i=0 ;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            a[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the element to be searched :");
        int s=in.nextInt();
        int k=0;
        for(int i=0 ;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            if(a[i][j]==s)
            {
                k=1;
                System.out.println("the item is found in the location row:"+(1+i)+"columen:"+(1+j));
                break;
            }
            }
        }
        if(k==0)
        {
            System.out.println("the element donot exist !!");
        }
        
    }
}
