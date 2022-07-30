 import java.util.*;
import java.util.ArrayList;;
public class wordSubset {
    // https://leetcode.com/problems/word-subsets/
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> ans = new ArrayList<>();

        int []maxFreqAcrossB = new int[26];
        for (String strInB : B) {
            int[] freqCountInB = countFrequency(strInB);

            for (int i = 0; i < 26; i++) {
                maxFreqAcrossB[i] = Math.max(maxFreqAcrossB[i], freqCountInB[i]);
            }
        }

        for (String strInA : A) {
            int[] freqCountInA = countFrequency(strInA);
            boolean foundAllCharacter = true;
            for (int i = 0; i < 26; i++) {
             if(freqCountInA[i] < maxFreqAcrossB[i]){
                foundAllCharacter = false;
                break;
             }
            }


            if(foundAllCharacter){
                ans.add(strInA);
            }
        }
        return ans;
    }


    private int[] countFrequency(String s){
        int [] freqCount = new int[26];
        for (char c : s.toCharArray()) {
            freqCount[c- 'a']++;
        }
        return freqCount;
    }
    public static void main(String[] args) {
        
    }
}
