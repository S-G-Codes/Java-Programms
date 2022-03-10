// https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list-iterative-solution/

public class ReverseAlternate {
 //same question as leet code ReverseKgroup just we have to  reverser alternatily
  //tc = O(n)
    //space constant
  
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
  
//skip k nodes
for (int i = 0; i < k && curr!=null; i++) {
    prev = curr;
    curr = curr.next;
}

  
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
