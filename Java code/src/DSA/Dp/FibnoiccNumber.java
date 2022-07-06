public class FibnoiccNumber {
    // https://leetcode.com/problems/fibonacci-number/

    //Approch 1
     //sc O(n)
       //tc O(n)
    // public int fib(int n) {
    //     if (n <= 1)
    //         return n;

    //     int dp[] = new int[n + 1];

    //     dp[0] = 0;
    //     dp[1] = 1;

    //     for (int i = 2; i <= n; i++) {
    //         dp[i] = dp[i - 1] + dp[i - 2];

    //     }

    //     return dp[n];

    // }

  //Approch 2
  //sc O(n)
  //tc O(n)

  //To reduce the sc do this   // use this for 1d array question mostly
  //1. Count the variable you are using in these case 2 i.e ( dp[0] = 0; dp[1] = 1;)
  //2. make the dp array of that size here it is 2
  //3. Where the opearation on dp is happening module(%) that by the count of variable
  //4. Internally it replaces the 0 and 1 index values until we loop through
  public int fib(int n) {
            if(n <=1) return n;

            int dp[] = new int[2];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                 dp[i %2] = dp[(i-1)%2] + dp[(i-2) %2];
            }

            return dp[n%2];


    }

    public static void main(String[] args) {
    }
}
