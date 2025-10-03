import java.util.Scanner;

public class Print_inverted_v 
{
public static void main(String[] args) {
    System.out.println("ENter the number of rows :");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<(n*2);j++)
        {
            if(j==n-i||j==n+i)
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
