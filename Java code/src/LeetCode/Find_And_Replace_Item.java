import java.util.*;
import java.util.ArrayList;

public class Find_And_Replace_Item {
    // https://leetcode.com/problems/find-and-replace-pattern/
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        String p = normalize(pattern);
     List<String> ans = new ArrayList<String>();

    for (String word : words) {
         if(p.equals(normalize(word))){
            ans.add(word);
         }
    
    
        }
        return ans;
    }
    private String normalize(String pattern) {
    HashMap<Character, Integer> map = new HashMap<>();
    int len = pattern.length();

    String ans = "";

    for (int i = 0; i < len; i++) {
        map.putIfAbsent(pattern.charAt(i), map.size());
        ans += map.get(pattern.charAt(i));
    }
 

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
