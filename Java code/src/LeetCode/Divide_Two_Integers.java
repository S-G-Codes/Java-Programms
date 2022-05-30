public class Divide_Two_Integers {
    // https://leetcode.com/problems/divide-two-integers/
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MAX_VALUE && divisor == -1)
        return Integer.MAX_VALUE;
    if(dividend == Integer.MIN_VALUE && divisor == -1)
        return Integer.MAX_VALUE;
    
    int a = Math.abs(dividend);
    int b = Math.abs(divisor);
    int res = 0;
    
    //difference is atleast 0
    while(a - b >= 0){
        int x = 0;
    
        //double of the prev value (if b is  3   values 6 for x = 0, 12 for x =1, 24, 48)
        // minimum 1 times of b
        while(a - (b << 1 << x) >= 0){
            x++;
        }
        
        // minimum add 1 upto pow of 2 (doubles each time 2, 4, 8...) 
        res += 1 << x;
        
        // minus the value 
        // atleast remove b
        a -= b << x;
    }
    
    return (dividend >= 0) == (divisor >= 0)? res : 0-res; 
}
    }

