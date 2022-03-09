public class RemovingDuplicates {
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
// Leetcode question 
//url = https://leetcode.com/problems/remove-linked-list-elements/submissions/

    public ListNode removeElements(ListNode head, int val) {             //a head and val i.e value the passed the val matches in the linked list remove that
        while(head != null && val == head.val){  //jab tak humarah head null nahi ho jata and given val humreh head.value seh match nahi hoteh tab tak
            head = head.next;   //loop chalegah head keh sareh next elements keh liya
        }
          ListNode temp = head;        //a tempory variable temp so we dont lose our head
          
          while(temp!= null && temp.next!= null){           
              if(temp.next.val == val){            //agar humreh head.next keh value given value seh match hojateh hai toh
                  temp.next = temp.next.next;      //humreh temp .next koh temp keh next keh next banadoh (just like cutting connecion)
              }else{
                  temp = temp.next;   //else keep travesing the list
              }
          }
  return head;
      }
    public static void main(String[] args) {
        
    }
}
