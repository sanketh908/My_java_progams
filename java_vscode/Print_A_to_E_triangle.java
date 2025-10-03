import java.util.Scanner;

public class Print_A_to_E_triangle
{
    public static void main(String [] args)
    {
        System.out.println("Enter the number os row :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)('A'+n-i));
            }
            System.out.println("");
            in.close();
            
        }
    }
    
}
