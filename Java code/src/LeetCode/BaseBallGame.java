import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/baseball-game/
public class BaseBallGame {
    public int calPoints(String[] ops) {
         List<Integer> ans = new ArrayList<>();

         for (String s : ops) {
              

            if(s.equals("+")){
                ans.add(ans.get(ans.size()-1) + ans.get(ans.size()-2));

            }else if(s.equals("D")){
              ans.add (ans.get(ans.size()-1)*2);
            }else if(s.equals("C")){
               ans.remove(ans.size()-1);
            }else{
                ans.add(Integer.parseInt(s));
            }
         }

           int count = 0;
           for (int i : ans) {
                 count = count+i;
           }
           return count;
    }
    public static void main(String[] args) {
        
    }
}
