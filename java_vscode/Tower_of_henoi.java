public class Tower_of_henoi {
    public static void tower(int n,char from_rod,char axl_rod,char to_rod)
    {
        if (n==0) {
            return;
            
        }
        tower(n-1, from_rod, to_rod,axl_rod );
        System.out.println("move disk "+n+" from rod "+from_rod+" to "+to_rod);
        tower(n-1, axl_rod, from_rod,to_rod);
        

    }
    public static void main(String[] args) {
        int n=3;
        
        tower(n,'A','B','C');
    }
}
