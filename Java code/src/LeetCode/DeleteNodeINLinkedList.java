public class DeleteNodeINLinkedList {
    // https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
    public void deleteNode(ListNode node) {
        int x = node.next.val;
        
        node.val = x;
        node.next = node.next.next;
    }
 public static void main(String[] args) {
     
 }   
}
