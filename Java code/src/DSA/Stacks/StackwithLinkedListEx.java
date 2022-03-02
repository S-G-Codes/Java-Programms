public class StackwithLinkedListEx {

    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

     static class Stack{
         public static Node head = null;

         public static boolean isEmpty() {
             return head==null;    
         }
   
         //Push operation in stack
         public static void PUSH(int data) {
             Node newNode = new Node(data);
                if(isEmpty()){
                       head = newNode;
                       return;
                }
                newNode.next = head;
                head = newNode;
         }


         //Pop operation in stack
         public static int POP() {
         if(isEmpty()){
             return -1;               
         }


             int top = head.data;    
             head = head.next;  //we have to just make the second elemet the head so the first one delete itself
             return top; 
         } 

         //peek operation in stack
          
         public static int PEEK() {
             if(isEmpty()){
                 return -1;
             }
                return head.data;

         }


     }



    public static void main(String[] args) {
       Stack s = new Stack();
       s.PUSH(1);
       s.PUSH(2);
       s.PUSH(3);
       s.PUSH(4);

        while(!s.isEmpty()){
            System.out.println(s.PEEK());
            s.POP();
        }
    }
}
