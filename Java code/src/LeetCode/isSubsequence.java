public class isSubsequence {
    // https://leetcode.com/problems/is-subsequence/
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;

     int spointer = 0;
     for (int t_pointer = 0; t_pointer < t.length(); t_pointer++) {
            if(s.charAt(spointer) == t.charAt(t_pointer)){
                spointer++;
                if(spointer == s.length()){
                    return true;
                }
            }
     }

     return false;
     
         
    }

    public static void main(String[] args) {
        
    }
}
