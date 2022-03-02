
import java.util.*;
class Node{
 int data;
 Node next;
 Node(int d){
        data=d;
        next=null;
    }
 
}
class Day24LlinkedList
{

    public static Node removeDuplicates(Node head) {
     if(head==null){
         return null;
     }
         Node dupliNode=head;
         while(dupliNode.next!=null){
             if(dupliNode.data==dupliNode.next.data){
                 dupliNode.next=dupliNode.next.next;
             }
             else{
                 dupliNode=dupliNode.next;
             }
         }
         return head;
        
     }
      
    public static  Node insert(Node head,int data)
    {
        Node NewNode=new Node(data);   
        if(head==null)
            head=NewNode;
        else if(head.next==null)
            head.next=NewNode;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=NewNode;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }