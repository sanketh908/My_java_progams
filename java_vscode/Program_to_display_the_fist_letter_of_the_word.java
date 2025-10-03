public class Program_to_display_the_fist_letter_of_the_word {
    public static void main(String[] args) {
        String str="I Hate Niggers";
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                if(i==0 ||(str.charAt(i-1)) ==' ')
                {
                    res+=str.charAt(i);
                }
            }
        }
        System.out.println("res ="+res);
    }
    
}
