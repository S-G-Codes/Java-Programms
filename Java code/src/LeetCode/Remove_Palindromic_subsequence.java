public class Remove_Palindromic_subsequence {
    // https://leetcode.com/problems/remove-palindromic-subsequences/

    //As we are given only a and b in string 
    //the cond is if string is palindrome remove it and if not you can remove characters to make it palindrome and then remove it
    //we have to return the min steps to make a string a count

    //Catch is if a string is already palindrome then we need only 1 step to make string empty
    // or else we can remove all a's or all b's to make it palindrome
    //so at max there will be 2 steps or else 1

    public int removePalindromeSub(String s) {
          if(s.length() ==0) return 0;

          if(isPalindrome(s)){
              return 1;
          }else{
              return 2;
          }
    }
    private boolean isPalindrome(String s) {
        int i =0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
       
    }
    public static void main(String[] args) {
        
    }
}
