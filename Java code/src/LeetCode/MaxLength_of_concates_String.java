import java.util.ArrayList;
import java.util.List;

class MaxLength_of_concates_String{
    // https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
    
    
    
    public int maxLength(List<String> arr) {
           List<String> res = new ArrayList<>();
           
           res.add("");

           for (String str : arr) {
              if( !isUnique(str)) {
                continue;
              }

              List<String> resList = new ArrayList<>();

              for (String candidate : res) {
                  String temp = candidate + str;
                  if( isUnique(temp)){
                    resList.add(temp);
                  }
              }
              res.addAll(resList);
           }

           int ans = 0;
           for (String str : res) {
              ans = Math.max(ans, str.length());
           }
           return ans;
    }
    
    private boolean isUnique(String str) {
         if(str.length() > 26) return false;

         boolean[] used = new boolean[26];

         char[] arr = str.toCharArray();

         for (char ch : arr) {
                if(used[ch  - 'a']){
                    return false;
                }else{
                    used[ch  - 'a'] = true;
                }
         }

        return true;
    }

    public static void main(String[] args) {
        
    }
}