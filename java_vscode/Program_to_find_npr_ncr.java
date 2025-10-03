import java.util.Scanner;

public class Program_to_find_npr_ncr {
    public static int npr(int n,int r)
    {
        return fact(n)/fact(n-r);

    }
    public static int ncr(int n,int r)
    {
        return fact(n)/(fact(r)*(fact(n-r)));

    }
    public static int fact(int n)
    {
        int cof=1;
        for(int i=2;i<=n;i++)
        {
            cof=cof*i;
        }
        return cof;
    }
    public static void main(String[] args) {
        System.out.println("Enter the valuer for N :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the valuse for R :");
        int r=in.nextInt();
        System.out.println("the "+n+"P"+r+" is ="+npr(n,r));
        System.out.println("the "+n+"C"+r+" is ="+ncr(n,r));
    }
    
}
