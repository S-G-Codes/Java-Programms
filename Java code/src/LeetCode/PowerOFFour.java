public class PowerOFFour {
    public boolean isPowerOfFour(int n) {
        if(n<= 0) return false;
        if(n ==1) return true;
      // return ((n & (n-3)) ==0);
  if( n % 4 ==0){
      return isPowerOfFour(n/4);
  }
      return false;
  }
    public static void main(String[] args) {
        
    }
}
