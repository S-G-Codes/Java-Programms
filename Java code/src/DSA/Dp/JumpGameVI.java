import java.util.PriorityQueue;
import java.util.Queue;

public class JumpGameVI {
    // https://leetcode.com/problems/jump-game-vi/

  static  public int maxResult(int[] nums, int k) {
    
        //edge case
        if(nums.length ==0) return 0;

        //keeping as a pair of Score and index
       Queue<int []> q = new PriorityQueue<>((a,b) -> b[0] - a[0]) ;
           
       //adding our first element and its index in Q
         q.offer(new int[] {nums[0] , 0});
        
         int maxScore = nums[0];
        for (int i = 1; i < nums.length; i++) {
              while(!(i - q.peek()[1] <=k )){
                     q.poll();
              }

              int[] currentElement = q.peek();
              maxScore = nums[i] + currentElement[0];
              q.offer(new int[] {maxScore,i});
        }
        return maxScore;
    }
    
    
    public static void main(String[] args) {
         int [] nums = {1,-5,-20,4,-1,3,-6,-3};
         int k = 2;
        System.out.println(maxResult(nums, k));
    }
}
