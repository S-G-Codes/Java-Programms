import java.util.Collections;
import java.util.LinkedList;


public class ReverselistwithCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
     
        
        // System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);
    }
}
