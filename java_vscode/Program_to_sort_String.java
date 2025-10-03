import java.util.Scanner;

public class Program_to_sort_String {
    
    public static  void sortstring(String str)
    {
        int max_char=26;
        int [] chars=new int[max_char];
        for(int i=0;i<str.length();i++)
        {
            chars[str.charAt(i)-'a']++;
        }
        for(int i=0;i<max_char;i++)
        {
            for(int j=0;j<chars[i];j++)
            {
                System.out.print((char)(i+'a'));
            }
        }
    }
   public static void main(String[] args) {
    System.out.println("enter the string to be sorted :");
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    sortstring(str);
   }

    
}
