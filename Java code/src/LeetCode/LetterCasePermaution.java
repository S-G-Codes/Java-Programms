import java.util.ArrayList;
import java.util.List;

public class LetterCasePermaution {
    // https://leetcode.com/problems/letter-case-permutation/
    
    public List<String> letterCasePermutation(String s) {
         //same dfs approch

         List<String> ans = new ArrayList<>();

         if(s.length() == 0) return ans;  //base cond

          helper(s.toCharArray(), ans , 0);
          return ans;
    }

    private void helper(char [] str , List<String> ans  , int index){
 
        //if we reaches to end of string add it to ans and return it
        if(index == str.length){
            ans.add(new String(str));
            return;
        }

         //if the current char is a digit we just move our index forward
         if(Character.isDigit(str[index])){
             helper(str, ans, index+1);
         }else{
             //converting to lowercase one by one recursively
                str[index] = Character.toLowerCase(str[index]);
                helper(str, ans, index+1);
                  
             //converting to Uppercase one by one recursively

                str[index] = Character.toUpperCase(str[index]);
                helper(str, ans,  index+1);
         }
    }
    public static void main(String[] args) {
        
    }
}
