import java.util.Scanner;

public class Print_alfabet_in_v 
{
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<(2*n);j++)
            {
                if(i==j)
                {
                    if(i!=n-1)
                    {
                    System.out.print((char)('A'+n-i-1));
                    }
                }
                else if(j==(n*2)-i-1)
                {
                    System.out.print((char)('A'+n-i-1));
                }
                else    
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
