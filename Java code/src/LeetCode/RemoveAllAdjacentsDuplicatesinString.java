import java.util.Stack;

public class RemoveAllAdjacentsDuplicatesinString {
    // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    
    //Tc O(n)  Space O(n)

 static   public String removeDuplicates(String s) {
         Stack<Character> stk = new Stack<>();

         for(char c : s.toCharArray()){
             if(!stk.isEmpty() && stk.peek() == c){
                 stk.pop();
                 continue;
             }
             stk.push(c);
         }

         String ans = "";

         while(!stk.isEmpty()){
             ans = stk.pop() + ans;
         }
         return ans;

    }
    public static void main(String[] args) {
          String  s = "abbaca";
           System.out.println(removeDuplicates(s));
    }
}
