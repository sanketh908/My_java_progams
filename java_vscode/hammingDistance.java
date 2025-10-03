public class hammingDistance    {
    public static void main(String[] args) {
        int x=5;
        int y=3;
        int xor=x^y;
        int count=0;
        while (xor!=0) {
            count+=(xor&1);
            xor>>=1;
            
        }
        System.out.println("hammingDistance of"+x+"and"+y+"is :"+count);
    }
    
}
