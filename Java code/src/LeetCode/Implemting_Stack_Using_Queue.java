import java.util.LinkedList;

// https://leetcode.com/problems/implement-stack-using-queues/
class MyStack {

    private LinkedList<Integer> q;
   public MyStack() {
       q = new LinkedList<>();
   }
   
   public void push(int x) {
       q.add(x);
       int size = q.size();
       while(size > 1){
           q.add(q.remove());
           size--;
       }
   }
   
   public int pop() {
     return  q.remove();
   }
   
   public int top() {
       return q.peek();
   }
   
   public boolean empty() {
       if (q.size() == 0){
           return true;
       }else{
        return   false;
       }
   }
}





public class Implemting_Stack_Using_Queue {
    
}
