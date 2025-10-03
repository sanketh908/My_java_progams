import java.util.Scanner;

public class Print_number_triangle 
{
    static void pattan(int n)
    {
        int j,i;
        for(i=0;i<n;i++)
        {
            for( j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            int num=1;
            for(int k=0;k<=i;k++)
            {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for(int m=0;m<i;m++)
            {
                System.err.print(num);
                num--;
            }
            System.out.println("");
        }
    }
public static void main(String[] args) {
    System.out.println("Enter the number of rows :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    pattan(n);

}    
}
