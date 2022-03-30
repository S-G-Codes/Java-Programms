import RemoveDuplicatesII.ListNode;

public class FindMiddleofLinkedList {

//url https://leetcode.com/problems/middle-of-the-linked-list/

//simple two pointer approch 
    public ListNode middleNode(ListNode head) {
      ListNode slow  =head;
      ListNode fast = head;

      while(fast!=null && fast.next !=null){
           slow = slow.next;
           fast = fast.next.next;
      }
      return slow;
      }
    public static void main(String[] args) {
        
    }
}
