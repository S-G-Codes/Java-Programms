public class MergeKsortedList {
  //url  https://leetcode.com/problems/merge-k-sorted-lists/

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


public ListNode mergeKLists(ListNode[] lists) {
    return binarysort(lists , 0 , lists.length-1);
}


public ListNode binarysort(ListNode a[], int low , int high){
    int mid = low + (high - low)/2;
    
    if(low<high){
    ListNode firstHalf = binarysort(a , low , mid);
    ListNode secondHalf = binarysort(a , mid+1 , high);
    
    return mergeTwoLists(firstHalf , secondHalf);
    }
    
    if(low >=0 && low < a.length){
        return a[low];
    }else{
        return null;
    }
    
}


 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null){      //this if else for if any of the list is empty
        return list2;
    } else if(list2==null){
        return list1;
    }
  ListNode merged = new ListNode();       //new Node
    ListNode temp = merged;              //a temp variabel to travese
    
    while(list1!= null && list2!=null){
        if(list1.val<list2.val){    //if list1 elemet is smaller than list2 element
            temp.next = new ListNode(list1.val);   //put that element in temp 
         list1 =    list1.next;       //and traverse the list1
        }else{ 
            temp.next = new ListNode(list2.val);    //same for list2
           list2 =  list2.next;
        }
        
        temp = temp.next;         //traversing temp
        
    }
     
    while(list1!=null){            //this to make sure our list1 and list2 is traverse fully 
        
          temp.next = new ListNode(list1.val);
         list1 =    list1.next;
         temp = temp.next;
    }
       while(list2!=null){
          temp.next = new ListNode(list2.val);
         list2 =    list2.next;
         temp = temp.next;
    }
    return merged.next;
    
    
}


  public static void main(String[] args) {
      
  }
}
