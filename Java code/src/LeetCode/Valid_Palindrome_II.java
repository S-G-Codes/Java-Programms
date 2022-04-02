public class Valid_Palindrome_II {
    // url https://leetcode.com/problems/valid-palindrome-ii/

  static  public boolean validPalindrome(String s) {
            
      int  low = 0;
      int high = s.length() -1;

      while(low<high){
          if(s.charAt(low) != s.charAt(high)){
                //check for low +1 means delete the low char
                boolean b1 = isPalindrome(s, low +1, high);
                //delete high char
                boolean b2 = isPalindrome(s, low, high-1);
             return b1|| b2;
            }
          low++;
          high--;
      }
      return true;

    }



    static public boolean isPalindrome(String s , int i , int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
       String s = "abca";
       System.out.println(validPalindrome(s)); 
    }
}
