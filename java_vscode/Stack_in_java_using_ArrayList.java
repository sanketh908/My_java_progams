import java.util.ArrayList;

public class Stack_in_java_using_ArrayList {
    class stack{
        ArrayList<Integer> list =new ArrayList<>();\
        public boolean isempty()
        {
            return list.size()==0;
        }
        public void push(int data)
        {
            list.add(data);
        }
        public int pop()
        {
        int top = list.get(list.size()-1);
          list.remove(list.size()-1);
          return top;
        }
    }
    public static void main(String[] args) {
        
    }
    
}
