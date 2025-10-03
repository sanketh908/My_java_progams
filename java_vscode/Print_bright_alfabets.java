import java.util.Scanner;

public class Print_bright_alfabets 
{
 
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
          for(int k=0;k<n-i;k++)
          {
            System.out.print((char)('A'+k));
          }
          for(int j=0;j<i;j++)
          {
           if(i!=0) {
            System.out.print("  ");
            }
          }
          for(int m=0;m<=n-1-i;m++)
          {
            if(m!=0){
            System.err.print((char)('A'+n-m-1));
            }
          }
           System.out.println("");
        }
       
    }
}
