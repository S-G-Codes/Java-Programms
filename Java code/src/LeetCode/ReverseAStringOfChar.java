public class ReverseAStringOfChar {
//https://leetcode.com/problems/reverse-string/submissions/
    public void reverseString(char[] s) {
        ans(s);
     }
     
     private char[] ans(char[] s){
             int low =0;
         int high = s.length -1;
          
         if( s.length == 1) return s;
         
         while(low <=high){
             char temp = s[low];
             s[low] = s[high];
             s[high] = temp;
              low++;
             high--;
         }
         return s;
     }
    public static void main(String[] args) {
        
    }
}
