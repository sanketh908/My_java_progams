import java.util.*;



public class Q_implimentation_using_linked_list {
   public static  node head=null;
   public static node tail=null;
   public static  class node
    {
        int data;
        node next;
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static  class queue{
        public boolean isEmpty()
        {
            return head==null &&tail ==null;    
        }
        public void add(int data)
        {
            node newnode=new node(data);
           if(tail==null)
           {
            tail=head=newnode;
            return;
           }
           tail.next=newnode;
           tail =newnode;

        }
        public int remove()
        {
         if(isEmpty())
         {
            System.out.println("the linked list is empty!!");
            return -1;
         }   
         
         int data =head.data;
         if(head ==tail)
         {
            tail =null;
         }
         head=head.next;
         return data;

        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("no elements found !!");
                return -1;
            }
            return head.data;
        }
        public  void print()
        {
            node point=head;
            while(point!=null)
            {
                System.out.print(point.data+"-->");
                point=point.next;
                
            }
            System.out.print("NULL");
        }

    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.print();
        
        

    }
    
}
