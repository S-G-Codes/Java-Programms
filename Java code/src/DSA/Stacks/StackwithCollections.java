import java.util.Stack;
import java.util.*;
;


public class StackwithCollections {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(s!=null){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
