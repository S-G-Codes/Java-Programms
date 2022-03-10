
public class REorderlist {

    
//leetcode class and its constructor
class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}


    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

   ListNode mid = middleNode(head);
   ListNode headFirst = head;
   ListNode headsecond = reverseLinkedList(mid);


   //reordering
   while(headFirst!= null && headsecond !=null){
       ListNode temp = headFirst.next;
       headFirst.next = headsecond;
       headFirst = temp;

       temp = headsecond.next;
       headsecond.next = headFirst;
       headsecond = temp;
   }


   //if headsecond comes out of above loop
     //make headfirst next null

     if(headFirst != null){
         headFirst.next = null;
     }





    }

    public  ListNode reverseLinkedList(ListNode head){

        //approch 1
        
             //using iterative approch
                
             if(head == null) return head;
                
                
             ListNode prev = null;
                     ListNode present = head;
                             ListNode next = head.next;
             
             while(present !=null){ 
          
                 present.next = prev;
                         prev = present;
                 present = next;
                 if(next !=null){
                     next = next.next;
                 }
                 
             }
             return prev;    //that is our new head now
            }        

            public ListNode middleNode(ListNode head) {
                ListNode s = head;
                ListNode f = head;
        
                while (f != null && f.next != null) {
                    s = s.next;
                    f = f.next.next;
                }
                return s;
            }




    public static void main(String[] args) {
        
    }
}
