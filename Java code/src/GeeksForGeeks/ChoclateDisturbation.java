public class ChoclateDisturbation {
    // https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1/#
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // Sliding window question
        //TC = O(nlogn)
       
        Collections.sort(a);
        long ans = Long.MAX_VALUE;
        
        for(int i =0; i <= n -m; i++ ){
          
            
            long diff = a.get((int) (i+m-1) ) - a.get((int) i);
            if(diff < ans){
                ans = diff;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
