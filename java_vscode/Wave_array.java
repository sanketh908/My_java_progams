public class Wave_array {
    public static void main(String[] args) {
        int [] a={10,90,49,2,1,5,23};
        wavearray(a,a.length);
    }
    public static void wavearray(int []a , int n)
    {
        int start=1;
     while (start<=n-2) {
     if(a[start-1]<a[start])
     {
        int temp=a[start];
        a[start]=a[start-1];
        a[start-1]=temp;
     }
     if(a[start+1]<a[start])
     {
        int temp=a[start];
        a[start]=a[start+1];
        a[start+1]=temp;
     }
     start=start+2;
     }
        for(int i:a)
        {
            System.out.println(i);
        }
    }

}
