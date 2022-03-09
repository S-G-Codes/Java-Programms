public class linkedListexample {
    Node head;
    private int size;
   linkedListexample(){
       this.size=0;           //size doest count null node
   }
class Node{
    String data;
    Node next;
     Node(String data){
         this.data =data;
         this.next = null;
         size++;
     }
     
}
//adding at first 



public  void addingAtFirst(String data) {
    Node newNode = new Node(data);     //making a new node to insert
    
    if(head == null){            //if there is no linked list present the add our newNode at first position
head = newNode;
return;
    }

     newNode.next=head;              //if there is a linked list then adding next to newNode pointing to head
    head = newNode;          //so now head is became our new Node  
}


//adding at last node
public  void addingAtLast(String data) {
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

//printing out list
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



//deleting firt node
public void deleteFirst(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }
    size--;
    head = head.next;
   


}


//deleting last
public void deleteLast(){
    if(head == null){
        System.out.println("List is empty");
        return;
    }

    size--;
    if(head.next == null){
        head = null;
        return;
    }

     Node secondLast = head;       //intiality making our head secondLast node and our lastNode koh head.next 
    Node lastNode = head.next;
    while(lastNode.next != null){         //and traversing through it jab tak humeh lastNode ka next null nahi milta 
        lastNode = lastNode.next;          
        secondLast = secondLast.next;
    }
    secondLast.next = null;               //so here we got our last node of Orginal Linked list  //this means last node is deleted
}

public int getSize(){
    return size;
}



//inserting with recursion

//tc = O(n)
//Sp = O(n)

public void insertWithRec(String data , int index){
    head = insertWithRec(data, index, head);
}

private Node insertWithRec(String data , int index , Node currNode){
      if(index == 0){
      Node temp  = new Node(data);
    

      size++;
      return temp;

      }


      currNode.next = insertWithRec(data, index-1, currNode.next);
      return currNode;
}



    public static void main(String[] args) {
        linkedListexample list = new linkedListexample();
    list.addingAtFirst("a");
    list.addingAtFirst("is");
    list.printList();
    list.addingAtLast("list");
    list.printList();
    list.addingAtFirst("This");
    list.printList();

    
    list.deleteFirst();
    list.printList();
 list.deleteLast();
 list.printList();

 list.addingAtFirst("Thiss");
 list.printList();
 
 System.out.println(list.getSize()); 


 list.insertWithRec("listttt", 3);
 list.printList();


    }
}
