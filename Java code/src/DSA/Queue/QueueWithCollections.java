import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

// Queue can me implenmented with Array and LinkedList
// Queue is a interface so its objects cant be made 
 
public class QueueWithCollections {
    public static void main(String[] args) {
        // Queue<Integer>  q = new LinkedList();         //with linkedList
         Queue<Integer>  q = new ArrayDeque<>();         //with ArrayDeque

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
