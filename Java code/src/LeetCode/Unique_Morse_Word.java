import java.util.HashSet;

public class Unique_Morse_Word {
    // https://leetcode.com/problems/unique-morse-code-words/
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set = new HashSet<>();
        for (String word : words) 
            set.add(transformMorse(word, arr));
        return set.size();
    }
    private String transformMorse(String word, String[] arr) {
        StringBuilder build = new StringBuilder();
        for (char c : word.toCharArray())
            build.append(arr[(int)c - 97]);
        return build.toString();
    }
    public static void main(String[] args) {
        
    }
}
