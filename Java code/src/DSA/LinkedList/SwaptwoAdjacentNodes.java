public class SwaptwoAdjacentNodes {

//leet code swap pairs node question
// url  ==    https://leetcode.com/problems/swap-nodes-in-pairs/


//swap fn with recursion way
//Run this fn in leet code site
 public ListNode swapPairs(ListNode head) {
    if(head == null || head.next==null) return head;
    int temp = head.next.val;
    head.next.val = head.val;
    head.val = temp;
    head.next.next = swapPairs(head.next.next);
    return head;
}

    public static void main(String[] args) {
        
    }
}
