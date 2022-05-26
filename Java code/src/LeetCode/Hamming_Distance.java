public class Hamming_Distance {
    // https://leetcode.com/problems/hamming-distance/
 static   public int hammingDistance(int x, int y) {
              
      //XOR Table return i.e x^y  return true only and only when both bits are different
       // 1 0 = 1
       // 0 1 = 1
       //1 1 = 0
       //0 0 = 0
    

              int ans = 0;
              int xor = x^y;
              //in xor variable 5 will be stored here thats bcz binary rep after doing x^y will be binary rep of 5.
            //   System.out.println(xor);   

              for (int i = 0; i < 32; i++) {
                //   System.out.println(xor>>i);
                    if(((xor>>i)&1) == 1 ){
                        ans++;
                    }
              }
              return ans;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
