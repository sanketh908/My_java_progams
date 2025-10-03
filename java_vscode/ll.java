public class ll {
    node head;
     public class node
    {
        
        String data;
        node next ;
        node(String data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    void addfist(String data)
    {
        node newnode=new node(data);
        if(head ==null)
        {
            head =newnode; 
            return;
        }
        newnode.next=head;
       head =newnode; 
    }
    public void printlist()
    {
     node currentnode=head;
     while (currentnode != null) {
        System.out.print(currentnode.data+"-->");
        currentnode=currentnode.next;
     }
     System.out.print("NULL");
    }
    public void addlast(String data)
    {
        node newnode=new node(data);
        if(head== null)
        {
            head=newnode;
            return;
        }
        node currentnode=head;
        while (currentnode.next != null) {
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;

    }
    public static void main(String[] args) {
        ll list=new ll();
        list.addfist("gay");
        list.addlast("lasbian");
        list.addfist("porn ");
        list.addfist("niggers");
        list.printlist();

    }
}
