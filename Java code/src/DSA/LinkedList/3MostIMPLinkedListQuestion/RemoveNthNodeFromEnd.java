public class RemoveNthNodeFromEnd {

    //leeet code problem
    
    //url = https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/

    //Our sol
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummpy = new ListNode(0, head);
        ListNode left = dummpy;
        ListNode right = head;
        
        while(n>0){
            right = right.next;
            n = n-1;
        }
        while(right !=null){
            left = left.next;
            right = right.next;
        }
        //deleting
        left.next = left.next.next;
        return dummpy.next;
    }

    //apna sol
    public ListNode ApnaSolremoveNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return head;
        }
        
         int size = 0;
         ListNode current = head;
         while(current!=null){
             current = current.next;
             size++;
         }
          if(n==size){
             return head.next;
         }
         int indexOfsearch = size - n ;
         ListNode prev = head;
         int i =1;
         while(i < indexOfsearch){
             prev = prev.next;
             i++;
         }
           prev.next = prev.next.next;
         return head;
    }

    public static void main(String[] args) {
     
    }
}


//Getting the nth Node using two pointers
// int getNthFromLast(Node head, int n)
//    {
//        if(head == null || head.next == null) {
//            return -1;
//        }
//     Node fast = head;
//     Node slow = head;
//     for(int jmp = 0; jmp < n; jmp++) {
//         if(fast == null) {
//             return -1;
//         }
//         fast = fast.next;
//     }
    
//     while(fast != null) {
//         slow = slow.next;
//         fast = fast.next;
//     }
    
//     return slow.data;
//    }