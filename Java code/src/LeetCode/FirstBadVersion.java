public class FirstBadVersion {


    // https://leetcode.com/problems/first-bad-version/
//Binary search algo 

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid =0;
      while(low<high){
           mid = low +(high - low)/2;
          
          if(isBadVersion(mid)){
              high  = mid;
          }else{
              low = mid+1;
          }
      }
        return high;
    }

    public static void main(String[] args) {
        
    }
}
