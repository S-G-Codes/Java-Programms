import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringWith_Concatenation_of_AllWords {

    // https://leetcode.com/problems/substring-with-concatenation-of-all-words/
    public List<Integer> findSubstring(String s, String[] words) {
         Map<String,Integer> map = new HashMap<>();
         List<Integer> ans = new ArrayList<>();
         
         for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
         }

         int wordCount = words.length;
         int wordLength = words[0].length(); //as the question stated all words are of same length
           
         
         for (int i = 0; i <=  s.length() - (wordCount * wordLength); i++) {
             Map<String,Integer> seen = new HashMap<>();
             
             for (int j = 0; j < wordCount; j++) {
                 int indexOfnextWord = i +j * wordLength;
           //check for finding the concentation word
                 String nextWord = s.substring(indexOfnextWord, indexOfnextWord+ wordLength);
                  
                 if(!map.containsKey(nextWord)){
                    break;
                 }

                 seen.put(nextWord, seen.getOrDefault(nextWord, 0) +1);
           
                  if(seen.get(nextWord) > map.getOrDefault(nextWord, 0)){
                  break;

                }

                if(j+1 == wordCount){
                      ans.add(i);
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
