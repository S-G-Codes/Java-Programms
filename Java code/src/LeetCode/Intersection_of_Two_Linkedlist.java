import java.util.HashSet;
import java.util.Set;

class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }

public class Intersection_of_Two_Linkedlist {
    // https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/
    // Approch 
    //             list1 = 4->1->8->4->5            leng = 5
    //              list2 = 5->6->1->8->4->5          leng = 6
    //        we took the diff of leng and on that whoever is bigger we will start traversing from there this because after the intersection point all the elemet will be common
    
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     ListNode t1 = headA;
    //             ListNode t2 = headB;
        
    //      int t1len = 0;
    //     ListNode tempt1 = headA;
    //     while(tempt1 != null){
    //         tempt1 = tempt1.next;
    //          t1len++;
    //     }
        
    //          int t2len = 0;
    //     ListNode tempt2 = headB;
    //     while(tempt2 != null){
    //         tempt2 = tempt2.next;
    //          t2len++;
    //     }
        
    //     int delta = Math.abs(t1len - t2len);
        
    //     if(t1len > t2len){
    //         for(int i = 0; i < delta ; i++){
    //             t1 = t1.next;
    //         }
    //     }else{
    //         for(int i = 0; i < delta ; i++){
    //             t2 = t2.next;
    //         }
    //     }
        
        
    //     while(t1 != t2){
    //        t1 = t1.next;
    //           t2 = t2.next;
    //     }
        
    //     return t1;

    // }



    //Approch 2
     //using hashset

     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        Set <ListNode> set = new HashSet<>();

        ListNode temp= headA;
        while(temp !=null){
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;

        while(temp !=null){
             if(set.contains(temp)){
                 return temp;
             }
                 temp = temp.next;
             
        }

return null;

     }
    public static void main(String[] args) {
        
    }
}
