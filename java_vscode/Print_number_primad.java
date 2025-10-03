import java.util.Scanner;

public class Print_number_primad 
{
    static void pattan(int n)
    {
        int i,j,gap=n;
        for(i=1;i<=n;i++)
        {
            for(int k=gap;k>=0;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+j);
                
            }
            gap--;
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
