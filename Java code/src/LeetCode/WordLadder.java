import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    // https://leetcode.com/problems/word-ladder/
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
     if(!wordList.contains(endWord)) return 0;   
    
     HashMap<String,Boolean> visitedMap = new HashMap<>();

     for (int i = 0; i < wordList.size(); i++) {
          visitedMap.put(wordList.get(i), false);
     }

     Queue<String> q = new LinkedList<>();
     int length =1;
     q.add(beginWord);
     visitedMap.put(beginWord, true);

     while(!q.isEmpty()){
        int size = q.size();
        for (int i = 0; i < size; i++) {
                String w = q.poll();
               if(w.equals(endWord)){
                return length;
               }

               wordMatch(w,visitedMap,q);
        }
        length++;
     }
     return 0;
    
    }
    
    private void wordMatch(String w, HashMap<String, Boolean> visitedMap, Queue<String> q) {
      
        for (int i = 0; i < w.length(); i++) {
            char[] word = w.toCharArray();

            for (int j = 0; j < 26; j++) {
                 char c = (char) ('a' + j);
                 word[i] = c;
                 String s = String.valueOf(word);
                 if(visitedMap.containsKey(s) && visitedMap.get(s) == false){
                    q.add(s);
                    visitedMap.put(s, true);
                 }
            }
        }
      
    
    }

    public static void main(String[] args) {
        
    }
}
