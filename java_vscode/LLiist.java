public class LLiist {
    node head;
    public int count=0;
    class node{
        String data;
        node next;
        node(String data)
        {
            this.data=data;
            next=null;
            count++;
        }
    }
    public void addfist(String data)
    {
        node newnode =new node(data);
        if(head == null )
        {
            head =newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }
    public void addmid(String data,int pos )
    {
        node newnode=new node(data);
        if(pos<0)
        {
            System.out.println("node cant be insertesd to the index 0!!");
            return;
        }
        if(pos==1)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        node current;
        for(int i=1;i<pos-1&&current!=null )
        {
            current=current.next;
        }
        if(current==null)
        {
            System.out.println("no node exist at this point !!");
            return;
        }
        newnode.next=current.next;
       current.next=newnode;
    }
    public void addlast(String data)
    {
        node newnode =new node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        node currentnode=head;
        while (currentnode.next !=null) {
        currentnode=currentnode.next;            
        }
        currentnode.next=newnode;
    }
    public void printlist()
    {
        node currentnode=head;
        if(head == null)
        {
            System.out.println("no node exists !!");
        }
        while (currentnode != null) {
            System.out.print(currentnode.data+"-->");
            currentnode=currentnode.next;
        }
        System.out.println("NULL");

    }
    public void deletelast()
    {
        if(head== null)
        {
            System.out.println("the list is empty !!");
            return;
        }
        count--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        node secoundlastnode=head;
        node lastnode=head.next;
        
            while (lastnode.next!=null) {
                secoundlastnode=secoundlastnode.next;
                lastnode=lastnode.next;
            }
            secoundlastnode.next=null;
        
    }
    public void deletefront()
    {
        if(head == null)
        {
            System.out.println("the list is empty !!");
            return;
        }
        count--;
        head=head.next;
    }
   public String findmid()
    {
            node currentnode=head;
            node fastpointer=currentnode;
            node slowpointer=currentnode;
            while (fastpointer.next != null) {
                fastpointer=fastpointer.next.next;
                slowpointer= slowpointer.next;
                
            }
            return slowpointer.data;
    }
    public int getsize()
    {
        return count ;
    }
    public static void main(String[] args) {
        LLiist list =new LLiist();
        
        list.addlast("this");
        list.addlast("is");
        list.addlast("a");
        list.addlast("linked");
        list.addlast("list");
        list.addfist("wtf");
        list.addlast("niggers");

        list.printlist();
       
        list.printlist();
        
        list.printlist();
        list.addmid(nig, 4);
        String mid =list.findmid();
        System.out.println("the mid element is :"+mid);
        System.out.println("the count of node in the linked list is :"+list.getsize());
        list.deletefront();
        System.out.println("the count of node in the linked list is :"+list.getsize());

    }

    
}
