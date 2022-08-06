public class PoorPigs {
    // https://leetcode.com/problems/poor-pigs/
    // Total number of rounds = minutesToTest/minutesToDie (= N) + 1 = N+1
    // (+1) because , if pig does not die in N, then (N+1)th contains poison.
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets-- ==1){
            return 0;
        }

        int base = minutesToTest/minutesToDie +1;
          int res =0;
          while(buckets >0){
            buckets = buckets/base;
            res +=1;
          }
          return res;

    }
    public static void main(String[] args) {
        
    }
}
