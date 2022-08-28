import java.util.HashMap;
import java.util.Map;

public class RansomeNote {
    // https://leetcode.com/problems/ransom-note/
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
                if(map.containsKey(ch)){
                     map.put(ch, map.get(ch) +1);
                }else{
                    map.put(ch, 1);
                }
        }
        for (char ch : ransomNote.toCharArray()) {
                if(!map.containsKey(ch) || map.get(ch) == 0){
                     return false;
                }else{
                    map.put(ch, map.get(ch) -1);
                }
        }
        return true;

              



       
    }
    public static void main(String[] args) {
        
    }
}
