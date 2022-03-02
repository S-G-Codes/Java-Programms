import java.util.*;
public class sameLineListwithCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");            //addFirst add the elemet at head position 
        list.addFirst("is");
        System.out.println(list);       //thats why   //output   [is, a] 


        list.addLast("listt");             //adds at last node  of linked list 
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

      System.out.println(list.size());       // this gives the size of whole list

      //to print whole list at once use for loop
      for (int i = 0; i < list.size(); i++) {
              System.out.print(list.get(i) + "-> ");      //get method helps to get all the node from list // there are more get method like get.first and get.last can be useful
      }
      System.out.print("NULL");
      System.out.println();

    list.removeFirst();      //this method will help to delte the first node
    System.out.println(list);

    list.removeLast();   //removes lasst node
    System.out.println(list);


      list.remove(1);      //to remove a certain node from list using index (starts from 0)
      System.out.println(list);
    }
}


//NOTE: iF we write only add instead of add.first or add.last then the new element is added at last node by deafult