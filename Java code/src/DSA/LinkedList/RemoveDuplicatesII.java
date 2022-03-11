public class RemoveDuplicatesII {

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

//leetcode 82
//url https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ) return null; 
        




        
       ListNode temp = new ListNode(0,head);    //store first element in a temp
        ListNode prev = temp;         //make a prev as out temp
     
        
        while(head!=null){ //looping whole list
         if(head.next !=null && head.val == head.next.val){   //checking head and head next is equal or not  
             while(head.next !=null && head.val == head.next.val){     // if yes do this
                 head = head.next;    //Deleting that node
             }
             prev.next = head.next;      //also setting our prev next to maintain the linked list 
         }else{
             prev = prev.next;    //moving forward
         }
        
        head = head.next;  //moving forward
        }
    return temp.next;        
    }
    public static void main(String[] args) {
        
    }
}
