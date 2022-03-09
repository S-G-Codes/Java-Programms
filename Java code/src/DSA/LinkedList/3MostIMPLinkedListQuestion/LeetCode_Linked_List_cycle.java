

public class LeetCode_Linked_List_cycle {
    //linked list cylce II
    //url = https://leetcode.com/problems/linked-list-cycle-ii/
//Tc  = O(n) space constant

    //approch will be

    //1. find the length of cycle
    //2. Move slow pointer ahead by length of cycle time
    //3. Move slow and fast one by one it will meet at start some point
    //4 return slow or fast bcz both will be at same point


    //length of cycle

    public static int length_of_cycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;


        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                // cycle detected same till now same as two pointer
                
                //calculating the length
                 ListNode temp = slow;
                 int length = 0;
                 do{
                     temp = temp.next;
                     length++;
                 }while(temp!=slow);
                 return length;
            }
        }
        return 0;
        
    }


    
    public ListNode detectCycle(ListNode head) {
   //first lets find a cycle
int length = 0;
      ListNode fast = head;
      ListNode slow = head;

      while(fast !=null && fast.next!=null){
          fast = fast.next.next;
          slow = slow.next;

          if(fast == slow){   //cycle detected
          length =     length_of_cycle(slow);   //length calculated
          break;
          }
      }


 if(length ==0) return null;     //base cond



 //now detecting the node where cycle is starting

 ListNode f = head;
 ListNode s = head;

 while(length >0){
     s = s.next;
     length--;
 }

 //moving both forward one by one as we discuss

 while( f!=s){
     f = f.next;
     s = s.next;
 }
 return s;   //or f both are at same point




    }





    public static void main(String[] args) {
        
    }
}
