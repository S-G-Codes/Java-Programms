import java.util.*;


public class ReverseAStack {

    public static void PushAtbtm(int data, Stack<Integer> s) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int top = s.pop();
PushAtbtm(data, s);
s.push(top);

}

  public static void reverse(Stack<Integer> s) {
    if(s.isEmpty()) {
        return;
    }
       int top = s.pop();
       reverse(s);
       PushAtbtm(top, s);
  }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }
    }
}


//before 
//3
//2
//1


//after
//1
//2
//3