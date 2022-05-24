import java.util.Stack;

public class Longest_Valid_Paranthesis {
    public int longestValidParentheses(String s) {
        if(s==null || s.length()<2){
           return 0;
}  


Stack<Integer> stk = new Stack<>();

for (int i = 0; i < s.length(); i++) {
       if(s.charAt(i) == '('){
           stk.push(i);
       }else{
                 
        if(!stk.isEmpty() && s.charAt(stk.peek()) == '('){
            //balanced case
            stk.pop();
        }else{
            stk.push(i);
        }
       }
}

int maxlength = 0;
int endTerminal = s.length();

while(!stk.isEmpty()){
    int startTerminal = stk.pop();
    maxlength = Math.max(maxlength, endTerminal - startTerminal - 1);
    endTerminal = startTerminal;
}

return Math.max(endTerminal, maxlength);


  }
    public static void main(String[] args) {
        
    }
}
