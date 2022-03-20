import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Contest_Biweky_74_Array_Halve {



    public int halveArray(int[] nums) {
        double sum =0;
        int  count =0;
   


        PriorityQueue<Double > pq = new PriorityQueue<Double>(Collections.reverseOrder());
       
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            pq.add( (double) nums[i]);
        }

        double target = sum/2;

        while(sum> target){
            count++;
           double highest =  pq.peek();
            pq.poll();
            sum -= highest;
            highest = highest/2;
            sum +=highest;
            pq.add(highest);
        }
        return count;


    }
    public static void main(String[] args) {
        
    }
}
