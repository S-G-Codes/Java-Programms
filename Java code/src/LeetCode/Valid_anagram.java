import java.util.HashMap;
import java.util.Map;

public class Valid_anagram {
    // https://leetcode.com/problems/valid-anagram/

    // An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
static    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
             map.put(c, map.getOrDefault(c, 0) +1);
        }
        for (char c : t.toCharArray()) {
             if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) -1);
             }else{
                return false;
             }
        }

        return true;


        
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
