import java.util.Stack;

public class QueueUsingStack {
    // IMP Question asked by Google and MicroSoft

    static class Queue{
         static Stack<Integer> s1 = new Stack<>();
         static Stack<Integer> s2 = new Stack<>();

    //  isEmpty fn
     public static boolean isEmpty() {
          return s1.isEmpty();
     }


    //   Adding
    public static void add(int data) {
         while(!s1.isEmpty()){           //jab tak humra s1 pura khali nahi hotha 
             s2.push(s1.pop());            //s1 is uthav aur s2 meh dalo
         }
         s1.push(data);           //naya element dal doh
                   
            while(!s2.isEmpty()){       //jab tak humra s2 pura khali nahi hotha 
             s1.push(s2.pop());         //s2 is uthav aur s1 meh dal doh
         }
    }
      public static int remove() {
          return s1.pop();
      }

      public static int peek() {
          return s1.peek();

      }
    }




    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
