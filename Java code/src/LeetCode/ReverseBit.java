public class ReverseBit {
    // https://leetcode.com/problems/reverse-bits/

    public int reverseBits(int n) {
        int result = 0;
         
        for (int i = 0; i < 32; i++) {
             int leftShiftBit =  n  & 1;
             int reverseBit = leftShiftBit << (31 - i);
             result = result | reverseBit;
             n = n >>1;


        }
       return result; 

    }
    public static void main(String[] args) {
        
    }
}
