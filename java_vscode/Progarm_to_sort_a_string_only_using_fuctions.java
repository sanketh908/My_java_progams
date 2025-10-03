import java.util.Arrays;
import java.util.Scanner;

public class Progarm_to_sort_a_string_only_using_fuctions {
    public static void sortstring(String str)
    {
        char [] temparr=new char[str.length()];
        temparr=str.toCharArray();
        Arrays.sort(temparr);
        for(char c:temparr)
        {
            System.out.println(c);
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        sortstring(str);
    }
    
}
