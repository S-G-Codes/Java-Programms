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
          //approch 
        //1. find the size of list
        //2. find the prev node of nth element
        //3. delete that prev.next element i.e nth element
        
        if(head.next == null) return null;
        
         //finding size 
          int size = 0;
          ListNode curr =  head;
          while(curr != null){
               curr = curr.next;
              size++;
          }
        
          //by this formula     (size - n +1) 
         if(n== size) return head.next;
        
          //find prev of n th node
         int prevIdxofN = size -n;
         ListNode prevOfN = head;
         int i = 1;
        while(i < prevIdxofN){
            prevOfN = prevOfN.next;
            i++;
            
        }
        //deleting the node
            prevOfN.next = prevOfN.next.next;
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