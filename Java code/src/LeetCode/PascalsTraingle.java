import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {
    // https://leetcode.com/problems/pascals-triangle/
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
          if(numRows == 0) return ans;
           int row = 1;     //first row will be 1 always

           List<Integer> subList =  new ArrayList<>();
           subList.add(1);
           ans.add(subList);

           while(row< numRows){
               List<Integer> previousList = ans.get(row-1);
               List<Integer> newList = new ArrayList<>();

               for (int i = 0; i <=row; i++) {
                  int leftside = i>=1 ? previousList.get(i-1):  0;
                  int rightside = i<row ? previousList.get(i):  0;
                newList.add(leftside + rightside);
               }
         ans.add(newList);
         row++;
           }
           return ans;
        }
    public static void main(String[] args) {
        
    }
}
