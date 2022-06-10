import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LongestSubstringwithoutRepeatElem {
    //url https://leetcode.com/problems/longest-substring-without-repeating-characters/

    
    static public int lengthOfLongestSubstring(String s) {


        int maxCount = 0;
        int i = 0;
        int j = 0;
        int n = s.length();

        Set<Character> st = new HashSet<>();     //using a set so we can get all uniques char 
 // we need the i and j so we can get the max substring of the string

        while( i < n &&  j < n){              // traversing the length of String
            if(!st.contains(s.charAt(j))){       //if our set doesn't contains the char at j then add it and increment the j and also keep the maxcount by taking the maximium between maxCount and i-j
           st.add(s.charAt(j));
           j++;
           maxCount = Math.max(maxCount, j-i);
            }else{
                st.remove(s.charAt(i));             //if it contains remove it and increase the i  
                i++;
            }
        }
        return maxCount;
       
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        // String s = "bbbbb";
       System.out.println(lengthOfLongestSubstring(s));

     
    }
}
