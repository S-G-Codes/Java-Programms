public class powofxAndn {
    // https://leetcode.com/problems/powx-n/
    public double myPow(double x, int n) {
        if(n==0 || x== 1.0){          //base cond 1 //we know that x raised to 0 is 1
       return 1;
}
    if(n == 1) return x;
if(x==0){           //base cond 2 //for x=0 return 0
    return 0;
}


if(n % 2 == 0){
    return myPow(x * x, n / 2);
}
else if(n % 2 == 1){
    return x * myPow(x, n - 1);
}
else{
    return 1 / myPow(x, -n);
}
}
    public static void main(String[] args) {
        
    }
}
