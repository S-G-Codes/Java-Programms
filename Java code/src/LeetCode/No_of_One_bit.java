public class No_of_One_bit {
    // https://leetcode.com/problems/number-of-1-bits/
//  static   public int hammingWeight(int n) {
      //TC = O(1) 
//       int ans = 0;
//       for (int i = 0; i < 32; i++) {
//           //standard way of extracting the right bit of any binary no
//         //   System.out.println(n>>i & 1);
//            if(((n>>i) & 1) == 1){
//                ans++;

//            }
//       }
//       return ans;
//     }


 static   public int hammingWeight(int n) {
             int ans = 0;

             while(n!=0){
                 n = (n& (n-1));
                 ans++;
             }
             return ans;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
