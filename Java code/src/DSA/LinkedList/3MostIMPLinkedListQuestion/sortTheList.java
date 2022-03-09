
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
public class sortTheList {
    public static void main(String[] args) {
     
    }

    

    public ListNode sortList(ListNode head) {
          //base cond
        if(head == null || head.next == null){
            return head;
        }

       ListNode mid = getMiddle(head);
       ListNode left = sortList(head);
       ListNode right = sortList(mid);

       return merge(left,right);


    }
 



  //merging two list

  ListNode merge(ListNode list1 , ListNode list2){
      ListNode merge = new ListNode();
      ListNode temp = merge;

      while(list1!= null && list2 != null){
          if(list1.val < list2.val){
              temp.next = list1;
              list1 = list1.next;
               temp = temp.next;
          }else{
              temp.next = list2;
              list2 = list2.next;
              temp = temp.next;
          }
      }

      temp.next = (list1 !=null) ? list1 : list2;

      return merge.next;

  }












    //get the middle element

    ListNode getMiddle(ListNode head){
        ListNode midPrevious = null;
        while(head != null && head.next != null){
            midPrevious = (midPrevious == null) ? head : midPrevious.next;

            head = head.next.next;
        }

        ListNode mid = midPrevious.next;
        midPrevious.next = null;
        return mid;
    }
}
