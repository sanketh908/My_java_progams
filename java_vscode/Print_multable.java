import java.util.Scanner;

public class Print_multable {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
    
}
