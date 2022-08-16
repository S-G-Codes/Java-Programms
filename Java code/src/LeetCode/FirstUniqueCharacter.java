import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    // https://leetcode.com/problems/first-unique-character-in-a-string/
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);  
        } 

        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if(map.containsKey(c)){
                if(map.get(c) ==1){
                          idx = i;
                          break;
                }


             }
            }
            return idx;
           
        

       
    }
    public static void main(String[] args) {
        
    }
}
