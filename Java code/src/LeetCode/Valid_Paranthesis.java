import java.util.Stack;

class Valid_Paranthesis{

    // https://leetcode.com/problems/valid-parentheses/
    public boolean isValid(String s) {
        if(s.length() < 1) return false;
      

           
        Stack<Character> stk = new Stack<Character>();

     for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i) == '('  || s.charAt(i) == '{' || s.charAt(i) == '['){
             
           stk.push(s.charAt(i));
         }else if(s.charAt(i) == ')'){
             if(!stk.isEmpty() && stk.peek() == '('){
                 stk.pop();
             }else{
                 return false;
             }
         }else if(s.charAt(i) == '}'){
            if(!stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }else{
                return false;
            }
        }else if(s.charAt(i) == ']'){
            if(!stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            }else{
                return false;
            }
        }else{
            return false;
        }


     }
            
            // if stack is empty finally , it means symbol is balance in expression
            if(stk.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }



    
    public static void main(String[] args) {
        
    }
}