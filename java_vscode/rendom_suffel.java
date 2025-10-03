import java.util.Random;

public class rendom_suffel 
{
 public static void main(String[] args) {
    try {
        String target="akashy is gay";
    String cha="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLNOPQRSTUVWXYZ!@#$%^&*()_+{}[]::';'<>?";
    Random rand=new Random();
    char[] correct=new char[target.length()];
    for(int i=0;i<target.length();i++)
    {
        correct[i]=' ';
    }
    for(int i=0;i<target.length();i++)
    {
        char cor=target.charAt(i);
        while (cor!= correct[i]) {
            correct[i]=cha.charAt(rand.nextInt(cha.length()));
            System.out.println("/r"+ new String(correct));
            Thread.sleep(20);
            
        }
    }
    } catch (Exception e) {
        System.out.println(e);
    }
 }   
}
