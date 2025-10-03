import java.util.Scanner;

public class Print_patten
{
    public static void main(String [] args)
    {
        System.out.println("Enter the number of rowes :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)('A' -1+ j));
            }   
            System.out.println("");
            in.close();
        }
    



    }

}
