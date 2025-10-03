import java.util.Scanner;

public class Print_E_to_a_in_desending_order
{
    public static void main(String []args)
    {
        System.out.println("Enter the number of rows :");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)('A'+j-1));
            }
            System.out.println("");

        }
        in.close();
    }
    
    
}
