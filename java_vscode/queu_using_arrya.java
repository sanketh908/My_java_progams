public   class queu_using_arrya {
    static class queu{
      public   int a[];
       public  int rear=-1;
       public  int size ;
        int frount;
        queu(int n)
        {
            a=new int [n];
            this.size=n;
        }
        public  boolean isEmpty ()
        {
            if(rear == -1)
            {
                return true;
            }
            return false;

        }
        public void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("The queq is full");
                return;
            }
            rear ++;
            a[rear]= data;
        }
        public  int  remove()
        {
            if(isEmpty())
            {
                System.out.println("no elements to remove !!");
                return -1;
            }
            frount=a[0];
            for(int i=0;i<size-1;i++)
            {
                a[i]=a[i+1];
            }
            rear--;
            return frount;
            
        }
        public int peek ()
        {
            if(isEmpty())
            {
                    System.out.println("no data found !!");
                    return -1;
            }
            return a[0];
        }
    }
    public static void main(String[] args) {
        int n=5;
        queu q=new queu(n);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
       while(!q.isEmpty())
       {
       System.out.println(q.peek()); 
        q.remove();
       }


    }
}
