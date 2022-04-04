import RemoveDuplicatesII.ListNode;

public class SwappingNodesInLinkedList {

    // https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

    //Algo
    //1. Reduce the k by 1 bcz head will at his poistion
    //2 . Traverse the list until k > 0 so it will give us the firstNode
    //3 . Take that previous Node and the second Node as head and start two pointer approch until first.next != null 
    //4 . Now you got the firstNode and SecondNode now swap them

    //TC = O(n) space constant

    public ListNode swapNodes(ListNode head, int k) {
          
        //base cond
        if(head == null || head.next == null || k  <0 ) return head;

        k = k-1;                 //because head will be at his position forever. So we will be never told to reverse the head 

        ListNode FirstNode = head;

        //Here we will get our firstNode from left to swap
     while(k>0){
         FirstNode = FirstNode.next;
         k--;
     }
     
     ListNode f = FirstNode;          //so we don't loose the firstNode
   ListNode secondNode = head;

   //here we will get our secondNode from right to swap
   while(f.next!=null){
       f = f.next;
       secondNode = secondNode.next;
   }

   //swap both
   int temp  = FirstNode.val;
   FirstNode.val = secondNode.val;
   secondNode.val = temp;

   return head;


    }
    public static void main(String[] args) {
        
    }
}
