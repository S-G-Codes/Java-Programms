import java.util.LinkedList;

public class linkedListHomeWork {


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
  list.add(1);
  list.add(5);
  list.add(7);
  list.add(3);
  list.add(8);
  list.add(2);
  list.add(3);
// System.out.println(list.size()); 
  System.out.println(list);
     
      System.out.println("Question was searcch for number 7 and display its indexx so its  " +list.indexOf(7));
    }
}
