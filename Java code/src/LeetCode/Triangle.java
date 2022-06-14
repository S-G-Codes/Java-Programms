import java.util.List;

public class Triangle {
    // https://leetcode.com/problems/triangle/
    //go from botttom to top take the min of two add into array compare it done
    public int minimumTotal(List<List<Integer>> triangle) {
         int dp[] = new int[triangle.size()+1];

         for (int i = triangle.size() -1 ; i >=0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);

            }
         }
         return dp[0];
    }
}
