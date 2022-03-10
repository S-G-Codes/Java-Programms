
// https://leetcode.com/problems/reverse-nodes-in-k-group/


  //tc = O(n)
    //space constant
public class ReverseNodesInKGroup {
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

public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k<=1) return head;

        ListNode curr = head;
        ListNode prev = null;

     int length = getLength(head);
     int count = length/k;

     while(count > 0){
         ListNode last = prev;
         ListNode newEnd = curr;
         
         ListNode next = curr.next;

         for (int i = 0; i < k && curr!=null; i++) {
             curr.next = prev;
             prev = curr;
             curr = next;
             if(next!=null){
                 next = next.next;
             }
         }

if(last!=null){
    last.next = prev;
}else{
    head = prev;

}


newEnd.next = curr;
prev = newEnd;
count--;



         
     }
     return head;

}


public int getLength(ListNode head){
    ListNode node = head;
    int length = 0;
    while(node!=null){
        node = node.next;
        length++;
    }
    return length;
}



public static void main(String[] args) {
    
}
}
