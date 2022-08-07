import java.util.HashMap;
import java.util.Map;

public class CountVowelPermanuation {
    // https://leetcode.com/problems/count-vowels-permutation/
  
    //map helps in memoization
   private Map<String, Long> map = new HashMap<>();
   private int MOD = 1000000007;
    public int countVowelPermutation(int n) {
          if(n==1) return 5;               
        
          long total = 0;
          char[] vowelSet = new char[]{'a','e','i','o','u'};

          for (char c : vowelSet) {
              total = (total + helper(n-1, c) ) % MOD;
          }
          return (int)total;
    }
    private long helper(int remaingChar, char prevChar) {

        if(remaingChar ==0) return 1;
        String key = "" + remaingChar + prevChar;

        if(map.containsKey(key)) return map.get(key);
        
        long total =0;
        switch(prevChar) {
            case 'a': total = (helper(remaingChar - 1,'e')) % MOD;
              break;
            case 'e': total = (helper(remaingChar - 1,'a') + helper(remaingChar - 1, 'i')) % MOD;
              break;
            case 'i': total = (helper(remaingChar - 1,'a') + helper(remaingChar - 1, 'e') + helper(remaingChar - 1, 'o') + helper(remaingChar - 1, 'u')) % MOD;
              break;
            case 'o': total = (helper(remaingChar - 1,'i') + helper(remaingChar - 1,'u')) % MOD;
              break;
            case 'u': total = (helper(remaingChar - 1,'a')) % MOD;
              break;
          }

        map.put(key, total);
        return total;

    }
    public static void main(String[] args) {
        
    }
}
