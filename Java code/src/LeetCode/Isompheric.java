import java.util.HashMap;
import java.util.Map;

class Isompheric{
    // https://leetcode.com/problems/isomorphic-strings/
             //is Isophermic means if we can replace string s with such unique character(can't repeat characters) to get the t string then the strings are Isophermic
            //   Approch is 1 . Create a two hashmap for s and t 
             //2 . check if each character exists in map already if yes check if they are equal if yes move forward else false
             //3 . Keep adding the characters in maps
             public boolean isIsomorphic(String s, String t) {
               if(s.length() != t.length()) return false;
               
               Map<Character, Character> smap = new HashMap<>();
               Map<Character, Character> tmap = new HashMap<>();
                 
               for (int i = 0; i < s.length(); i++) {
                     Character schar = s.charAt(i);
                     Character tchar = t.charAt(i);
                     
                     if(smap.containsKey(schar)){
                        if(smap.get(schar) != tchar){
                            return false;
                        }
                     }


                     if(tmap.containsKey(tchar)){
                        if(tmap.get(tchar) != schar){
                            return false;
                        }
                     }

                     smap.put(schar, tchar);
                     tmap.put(tchar,  schar);
                  
               }
               return true;
    }
    public static void main(String[] args) {
        
    }
}