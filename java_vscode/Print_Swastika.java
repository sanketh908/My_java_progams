import java.util.Scanner;

public class Print_Swastika 
{
   static void print_pat(int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              if(i<row/2)
              {
                if(j <col/2)
                {
                    if(j==0)
                    {
                      System.out.print("* ");  
                    }
                    else 
                    {
                        System.out.print(" "+" ");
                    } 
                }
                else if(j==col/2)
                {
                    System.out.print("* ");
                }
                else
                {
                    if(i==0)
                    {
                        System.out.print("* ");
                    }
                }
              }
              else if(i == row/2)
              {
                System.out.print("* ");
              }
              else
              {
               if(j==col/2 || j==col-1)
               {
                System.out.print("* ");
               }
               else if(i== row-1)
               {
                if(j <=col/2 ||j == col-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" "+" ");
                }

               }
               else
               {
               System.out.print(" "+" ");
               }
              }
          
            }  
            System.out.println("");  
            
           
        }


    }
public static void main(String[] args) 
{
System.out.println("Enter the number of rows : ");
Scanner in=new Scanner(System.in);
int r=in.nextInt();
System.out.println("Enter the number of colums :");
int c=in.nextInt();
print_pat(r,c);

}    
}
