import java.util.Scanner;

public class Hacker_ha_bai_hacker 
{
 public static void main(String[] args) {
   
    String print="akshay pure nigger ";
    String able="1234567890abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWKYZ-+={[|'';:<>,./]}"+"         ";
    String temp="";
   
    
    
    try   
    {
        for(char  a : print.toCharArray())
        {
            if(temp.equals(print))
            {
               break;
            }

            
            for(char c :able.toCharArray())
            {
                

                if(a==c)
                {
                    System.out.println(temp+a);
                    Thread. sleep(20);
                    temp+=a;
                    break;
                }
                else
                {
                    System.out.println(temp+c);
                    Thread.sleep(20);
                }
               
            }
           
            
        }
       
      
    } catch (Exception e) {
      System.out.println(e);  
    }

}
}   

