import java.util.*;
public class Program_to_find_the_mid_of_the_linked_list {
    public static node head=null;
   public static class node{
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            next=null;
        }
    }
   
 
   static  class list{
    public static boolean isempty()
    {
    return head ==null;
    }
     public static void add(int data)
    {
        node newnode=new node(data);
        if(isempty())
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void  printlist()
    {
        node point=head;
        while (point.next !=null) {
            System.out.print(point.data+"-->");
            point=point.next;
               
        }
        System.out.print("null");
    }
        public static void addl(int data)
        {
            node point=head ;
            while (point.next !=null) {
            point=point.next;
        }
         node newnode=new node(data);
        point.next=newnode;
        


        }
    public static void main(String[] args) {
       list l=new list();
         l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.printlist();
        
        

        

    }
    
}
}