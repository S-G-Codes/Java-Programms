public class QueueUsingLinkedList {
  
    // TC = O(1)
 static   class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

 static class Queue{
  static Node head =null;
  static Node tail=null;

//    empty fn
  public static boolean isEmpty(){
      return head == null && tail == null;
  }

//    Add or Enqueue
 public static void add(int data) {
      Node newNode = new Node(data);

    //   if our list is empty
     if(tail == null){
         tail = head = newNode;
         return;
     }
    //  else
    tail.next = newNode;
 tail = newNode;

 }

//  Remove or dequeue
public static int remove(){
    if(isEmpty()){
        System.out.println("Queue is Empty");
        return -1;
    }
   
    int front = head.data;
    
    // if only one element
    if(head == tail){
        tail = null;
    }

    // else
    head = head.next;
    return front;

}


public static int peek() {
    if(isEmpty()){
        System.out.println("Queue is Empty!");
        return -1;
    }
     return head.data;
}





    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
