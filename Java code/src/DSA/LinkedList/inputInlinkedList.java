import java.util.LinkedList;
import java.util.Scanner;

public class inputInlinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

           list.add(sc.nextInt());
           System.out.println(list);
              
          sc.close();

    }
}
