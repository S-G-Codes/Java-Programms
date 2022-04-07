public class DetectLoopAndDeleteIt {
    //Geeks for geeks
    // https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1/?page=1&company[]=Microsoft&sortBy=submissions

    public static void removeLoop(Node head){
         detectLoop(head);
         return;
     }
     
      public static void detectLoop(Node head){
            Node slow = head;
            Node fast = head;
            boolean flag = false;

            while(fast.next != null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
               

                 if(slow == fast){
                     flag = true;
                 }
            }


            if(flag){
                if(slow == head && fast == head){

                   while(slow!=fast.next){
                        fast = fast.next;
                   }
                   fast.next = null;
                }else{
                    slow = head;
                    while(slow.next != fast.next){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    fast.next = null;
                }
            }
      }
    public static void main(String[] args) {
        
    }
}
