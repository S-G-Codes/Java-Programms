import javax.crypto.Cipher;

public class PermautationInString {
    // https://leetcode.com/problems/permutation-in-string/

//https://www.youtube.com/watch?v=24r8fvX8pek

  //alog is simple
  //1. we will take an array of fixed length that will be 26 as we are playing with character 
  //2 . then we will using slidinig window  i.e we will take s1's length char  and will try to find permaution in by taking s1 length if found then return true if not slide by 1 means first we were checking for 0 ,1,2 now we will slide by 1 that is 1,2,3 and so on
  //3 .and while sliding we will count the freq of character 
  //4 . And at end we if get all zero in our array means permauation is find return true;

    public boolean checkInclusion(String s1, String s2) {
          int s1Len = s1.length();
          int s2Len = s2.length();

          if(s1Len > s2Len) return false;

          int [] count = new int[26];

          for (int i = 0; i < s1Len; i++) {
              count[s1.charAt(i) - 'a']++;
          }

          for (int i = 0; i < s2Len; i++) {
              count[s2.charAt(i) - 'a']--;
              if( i - s1Len >=0){
                  count[s2.charAt( i - s1Len) - 'a']++;

                  if (allZero(count)) return true;
              }
          }
          return false;


    }


    private boolean allZero(int[] count){
        for (int i = 0; i < 26; i++) {
            if( count[i] !=0) return false;
        }
        return true;

    }
    
    public static void main(String[] args) {
        
    }
}
