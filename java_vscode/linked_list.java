public class linked_list {
    node head;
    public static class node
    {
        int data ;
        node next;
        public node(int data)
        {
            this.data=data;
            next=null;
        }
        public void addfrount(int data)
        {
            node newnode=new node(data);
            if(head == null)
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
    }
    public static void main(String[] args) {
        linked_list l=new linked_list();
        addfrount(5);
    }
    
}
