public class RevesLeftRight {

    //leet code question 

    // url https://leetcode.com/problems/reverse-linked-list-ii/submissions/

    


    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
return head;
        ListNode dummy = new ListNode(0);
         dummy.next = head;
        ListNode prev = dummy;
        
        for(int i =0; i< left-1; i++){
               prev = prev.next;
        }
        
    ListNode start = prev.next;
        ListNode end = start.next;
        
        for(int i=0; i< right-left; i++){
              start.next = end.next;
            end.next = prev.next;
            prev.next = end;
            end = start.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        
    }
}
