import java.util.ArrayList;
import java.util.List;



public class ExpressionAddOperator {
    // https://leetcode.com/problems/expression-add-operators/

    
  static      private List<String> ans = new ArrayList<>();
    
   static     public List<String> addOperators(String s, int target) {
            dfs( 0, "", 0, 0,s, target);
            return ans;
        }
  static      private void dfs(int i, String path, long resSoFar, long prevNum, String s, int target) {
            if (i == s.length()) {
                if (resSoFar == target) ans.add(path);
                return;
            }
            for (int j = i; j < s.length(); j++) {
                if (j > i && s.charAt(i) == '0') break; // Skip leading zero number
                long currNum = Long.parseLong(s.substring(i, j + 1));
                if (i == 0) {
                    dfs(j + 1, path + currNum, currNum, currNum,s, target); // First num, pick it without adding any operator!
                } else {
                    dfs(j + 1, path + "+" + currNum, resSoFar + currNum, currNum,s, target);
                    dfs(j + 1, path + "-" + currNum, resSoFar - currNum, -currNum, s, target);
                    dfs(j + 1, path + "*" + currNum, resSoFar - prevNum + prevNum * currNum, prevNum * currNum, s, target);
                }
            }
        }
    


    
    public static void main(String[] args) {
            String num = "123";
            int target = 8;

        System.out.println(addOperators(num, target));
    }
}
