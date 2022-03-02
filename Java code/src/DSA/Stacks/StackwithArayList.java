import java.util.ArrayList;

public class StackwithArayList {
  static  class Stack{
     static  ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
         return    list.size() == 0;
        }

        //push
public static void PUSH(int data) {
      list.add(data);
}

//pop
public static int  POP() {
  if(isEmpty()) return -1;

      int top = list.get(list.size()-1);
      list.remove(list.size()-1);
      return top;
}


//peek

public static int PEEK() {
    if(isEmpty()) return -1;

    return list.get(list.size()-1);
    
}


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.PUSH(1);
        s.PUSH(2);
        s.PUSH(3);
        s.PUSH(4);


        while(!s.isEmpty()){
            System.out.println(s.PEEK());
            s.POP();
        }
    }
}

