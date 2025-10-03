import java.util.Scanner;

public class Angle_between_clock_hands 
{
    static double find_lowest(double x,double y)
    {
        if(x>y)
        {
            return y;
        }
        else
        {
            return x;
        }
    }
    static double find_angle(String n)
    {
        int  h=Integer.parseInt(n.substring(0, 2));
        int  m=Integer.parseInt(n.substring(3, 5));
        h=h%12;
        double h_angle = 0.5*(60*(h+m));
        double m_angle=6*m;
        double angle = h_angle-m_angle;
        return (find_lowest(360-angle,angle));
        

        

    }
 public static void main(String[] args) 
 {
    System.out.println("Enter the Time in (00:00 format):");
    Scanner in=new Scanner(System.in);
    String time = in.nextLine();
     System.out.println(find_angle(time));
    in.close();
 }   
}
