import java.util.*;

import RemoveDuplicatesII.ListNode;


public class PartationList {
    // https://leetcode.com/problems/partition-list/
    public ListNode partition(ListNode head, int x) {
        ListNode smallerHead = new ListNode(-1);
        ListNode  greaterHead = new ListNode(-1);

        ListNode IteratorForSmallerHead = smallerHead;
        ListNode IteratorForGreaterHead =  greaterHead;

        ListNode IteratorForHeadList = head;


        while(IteratorForHeadList != null){
            if(IteratorForHeadList.val < x){
                IteratorForSmallerHead.next = IteratorForHeadList;
                IteratorForHeadList = IteratorForHeadList.next;
                IteratorForSmallerHead = IteratorForSmallerHead.next;
            }else{
                IteratorForGreaterHead.next = IteratorForHeadList;
                IteratorForHeadList = IteratorForHeadList.next;
                IteratorForGreaterHead = IteratorForGreaterHead.next;
            }
        }

        //why = greaterHead.next bcz  greaterHead value is -1 which is not a part of main Head list
        IteratorForSmallerHead.next = greaterHead.next;
        IteratorForGreaterHead.next = null;

        return smallerHead.next;
    }
    public static void main(String[] args) {
        
    }
}
