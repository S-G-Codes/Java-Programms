public class NumbersofONEBit {
    // https://leetcode.com/problems/number-of-1-bits/


    // Approch
    //Basically the Question is you will be given a binary 32 digit you have to make all zeros in it 
     // 1 . we will take n and n-1 and do the Bitwise AND operations until all n becomes zero and also keep the count of operations.
 static   public int hammingWeight(int n) {
        int count = 0;
         while(n!=0){
              n =  n & (n-1);
              count++;
         }
         return count;
    }
    public static void main(String[] args) {
         int n = 00000000000000000000000000001011;
         System.out.println(hammingWeight(n)); 
    }
}
