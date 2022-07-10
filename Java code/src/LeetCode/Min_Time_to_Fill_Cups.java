import java.util.PriorityQueue;

public class Min_Time_to_Fill_Cups {
    // https://leetcode.com/contest/weekly-contest-301/problems/minimum-amount-of-time-to-fill-cups/
    public int fillCups(int[] amount) {
          
        //Max PQ
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> (b-a));

         for (int element : amount) {
             q.offer(element);
         }


         int ans = 0;

         while(!q.isEmpty()){
             int firstElement = q.poll();
             int secondElement = q.poll();


             if(firstElement <=0 && secondElement <=0){
            break;
             }

              firstElement--;
              secondElement--;
              q.offer(firstElement);
              q.offer(secondElement);
              ans++;
        


         }
         return ans;
    }
    public static void main(String[] args) {
        
    }
}
