public class Steack_in_java {
   
    static class  node
    {
    
        int data ;
        node next;
        public node(int data )
        {
            this.data=data;
            this.next=null;
        }
    }
   public  static class stack
    {
         public static node head;
        public   boolean isempty()
        {
           return head == null; 
        }
        public void push(int data)
        {
            node newnode=new node(data);
            if(isempty())
            {
                head =newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public int pop()
        {
            if(isempty())
            {
                System.out.println("no node exists !!");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek()
        {
            
            if(isempty())
            {
                return -1;
            }
            return head.data;
            
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
      while(!s.isempty())
      {
        System.out.println(s.peek());
        s.pop();
      }



        
    }
    
}
