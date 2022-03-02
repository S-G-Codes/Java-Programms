import java.util.Scanner;


class Node {                           //making a class with variables data and a node next for storing values
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null; //intalize next is null
    }
}



public class LinkedListDayFifteen {
    public static Node insert(Node head, int data){       //insert fn to add head and data 
        if(head==null){                      //agar head meh kuch nahi hai toh return kar jaou
            return new Node(data);
        }else if(head.next == null){            //agar head keh next meh kuch nahi hai toh next meh ek naya Node bano aur usmeh data dal doh
            head.next = new Node(data);
        }else{
            insert(head.next, data);          //recusrion call for next node 
        }
        return head;            //sab hohneh keh badh head return kar doh 
        
    }

    public static void display(Node head) {                  //head koh display karneh keh liya fn 
        Node start = head;                      //ek variable lehreh start jismeh head keh value hogeh 
        while(start != null){                   //jab tak start null nahi hotha tab tak usmeh har ek indiviual ka data print kardoh with a space
            System.out.print(start.data + " ");
            start = start.next;            //re intialzing        //F..  my voculabary 
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Node head = null;                       //Node is a indiviual data holding block  // intializie we are making it null
       int N = sc.nextInt();               //taking size of linked list 

       while(N-- > 0){        //taking elements in linked list
           int element = sc.nextInt();
           head = insert(head, element);       //insert kareh head aur apneh elements 

       }
       display(head);               //displaying them 
       sc.close();




    }
}
