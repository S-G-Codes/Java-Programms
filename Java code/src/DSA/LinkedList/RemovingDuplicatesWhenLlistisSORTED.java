public class RemovingDuplicatesWhenLlistisSORTED {

//letcode question 
//url == https://leetcode.com/problems/remove-duplicates-from-sorted-list/

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





    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(head==null || head.next ==null) return head;
        
        while(temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
        

    }
    public static void main(String[] args) {
        
    }
}
