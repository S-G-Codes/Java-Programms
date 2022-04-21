import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    // https://leetcode.com/problems/merge-intervals/
    //Aprroch  TC = O(n) and space O(n)
    // 1. is to sort the array
    // 2 . make a linked list to store your ans
    //3.  check if our second element of first interval eg (1,3) here 3 and max of second interval i.e (2,6) here 6 if 3 is <=6 means it overlapping so merged it
     //4 . add  the merged interval in ans
     //5 . return the ans
    public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals , (a,b) -> Integer.compare(a[0], b[0]) );
           LinkedList<int[]> ans  = new LinkedList<>();
           for (int[] interval : intervals) {
                 if(ans.isEmpty() || ans.getLast()[1] < interval[0]) {
                     ans.add(interval);
                 }else{
                     ans.getLast()[1] = Math.max(ans.getLast()[1], interval[1]);
                 }
           }
           return ans.toArray( new int[ans.size()] []);
        }
    public static void main(String[] args) {
        
    }
}
