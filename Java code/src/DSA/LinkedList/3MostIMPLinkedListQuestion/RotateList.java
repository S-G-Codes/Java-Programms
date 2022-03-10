
public class RotateList {

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


// https://leetcode.com/problems/rotate-list/
//Draw the diagram and observe


    public ListNode rotateRight(ListNode head, int k) {
        if(k <= 0|| head == null || head.next == null) return head;
        
        ListNode last = head;
        int length = 1;
        
        while(last.next!=null){
            last = last.next;
            length++;
        }
         last.next = head;
        int rotation =  k % length;              //eg suppose you have told to rotate 8 times and length of list is 6 so after 6 rotation list will have no change so save computation power we did 8 & % 6 i.e 2 so we need to rotate only 2 times
        int skip =  length - rotation;            
        ListNode newLast = head;
        
        for(int i = 0; i< skip-1 ; i++){
            newLast = newLast.next;
        }
        
        head = newLast.next;
        newLast.next = null;
          return head;
    }
    public static void main(String[] args) {
        
    }
}
