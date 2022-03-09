public class DetectingLoop {
    //leet code problem

//url = https://leetcode.com/problems/linked-list-cycle/submissions/

//sol 
public boolean hasCycle(ListNode head) {
    if(head == null){
        return false;
    }
    ListNode hare = head;
    ListNode turtle = head;
    
    while( hare != null && hare.next != null ){
        hare = hare.next.next;
        turtle = turtle.next;
        
        if(hare == turtle){
            return true;



            /*  
            We can also calculate the length of cycle 
            ListNode temp = slow;
            int length = 0;

            do{
               temp = temp.next;
               length++;
            }while(slow !=temp)



            */
        }
    }
    return false;
}
    public static void main(String[] args) {
        
    }
}
