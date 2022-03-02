

public class ReverseLinkedList {
    Node head;
    
   
class Node{
    Integer data;
    Node next;
     Node(Integer data){
         this.data =data;
         this.next = null;
     }
     
}

public  void addingAtLast(Integer data) {
    Node newNodeforLast = new Node(data);
    if(head == null){            //if there is no linked list present the add our newNode at first position
        head = newNodeforLast;
        return;
    }

    //traversing through list 
    //why currentNode variable bcz if we use our head node for traversing then we might loose our head node
    Node currentNode = head;    //making a current node and putting our head into it
    while(currentNode.next != null){               //jab tak humara currrent Node ka next null nahi hogata tab tak loop chelegha 
     currentNode = currentNode.next;         //taversing
    }

    currentNode.next = newNodeforLast;
}

public void reverseLinkedList(){
if(head == null || head.next== null){
    return;
}


    Node prevNode = head;
    Node currNode = head.next;

    while(currNode!= null){
        Node newNode = currNode.next;
        currNode.next = prevNode;

        //updating 
        prevNode = currNode;
        currNode = newNode;
    }

    head.next= null;
    head = prevNode;
}


    public  void printList() {
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node currentNode = head;    
        while(currentNode != null){ 
            System.out.print(currentNode.data + " -> ");             
         currentNode = currentNode.next;       
        }
     System.out.println("NULL");
    }


    public Node reverseWithRecursion(Node head){
        if(head == null || head.next== null){
return head;
        }

        Node newHead = reverseWithRecursion(head.next);
        
        head.next.next = head;
        head.next = null;

        return newHead;


    }


    public static void main(String[] args) {
ReverseLinkedList list = new ReverseLinkedList();
         
list.addingAtLast(1);
list.addingAtLast(2);
list.addingAtLast(3);
list.addingAtLast(4);
        list.printList();


// list.reverseLinkedList();
// list.printList();


list.head = list.reverseWithRecursion(list.head);
list.printList();
    }
}



//Reversing a Linked List by using loop
//Tc O(n)
//space  O(1)
 
//We are taking 3 nodes at a time
//0.Corner cond  - if head==null or head.next==null return   
//steps //1. create a prevnode and make it as headnode
//2. make a current node and store heads.next value in there
//3 Run a loop until currentNode becames null 
//4. in loop make a new node as a NextNode and store currentNode.next in it
//5 and in currentnode.next store prevNode v
//6. update it   prevNode = currentNode and currenNode = nextNode
//7. now outside the loop make head.next = null and head = prevNode
//List is Reversed



//Now reversing the list with recursion
//1/ make a fn with Node return type and pass a Node head in that
//2. corner condination if head == null OR head.next == null return head
//3 Make a Node newhead and call the recursive fn with head.next in paramters
//4. make head.next.next  = head      
//eg here  (2).(3) (3s next) = (2)
//5. make head.next = null
//6 return newHead
//call it in main fn   
//list.head = list.reverseRecusion(list.head);