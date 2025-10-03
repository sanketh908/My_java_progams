public class circular_queue {
    public static class queue {
        int []a;
       
        int rear =-1;
        int front=-1;
        int size;
        queue (int n)
        {
            a=new int[n];
            this.size=n;
        }
        public void add (int data)
        {
            if(isFull())
            {
                System.out.println("the Q is full !!");
                return;
            }
            if(front==-1 )
            {
                front=0;
            }
            rear=(rear+1)%size;
            a[rear]=data;
        }
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("the Q is full !!");
                return -1;
            }
            int n=a[front];
           if(front==rear)
           {
            front=-1;
            rear=-1;
           }
           else{
            front=(front+1)%size;
           }
          
            return n;

        }
        public int peek ()
        {
            if(isEmpty())
            {
                System.out.println("the Q is empty !!");
                return -1;
            }
            return a[front];
        }
        public boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public boolean isFull()
        {
            return (rear+1)%size==front;
        }

    
        
    }
    public static void main(String[] args) {
        int n=5;
        queue q=new queue(n);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.remove();
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);   
        while(! q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
    
}
