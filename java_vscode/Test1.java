public class Test1 {
    public static void main(String[] args) {
        String target ="I Heate Niggers";
        String test ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*(><?"+" ";
        String temp="";
        try {
            for(char a : target.toCharArray())
        {
            if(temp==target)
            {
                break;
            }
            for(char b :test.toCharArray())
            {
                if(a==b)
                {
                    System.out.println(temp+b);
                    Thread.sleep(20);
                    temp+=b;
                 break;   
                }
                else{
                    Thread.sleep(20);
                    System.out.println(temp+b);
                }
                
            }
        }
            
        } catch (Exception e) {
           System.out.println(e);
        }
        
    }
    
}
