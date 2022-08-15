import java.util.*;
import java.util.ArrayList;

public class Roman_To_Integer {
    // https://leetcode.com/problems/roman-to-integer/
    public int romanToInt(String s) {
     Map<Character,Integer> map = new HashMap<>();
     map.putIfAbsent('I', 1);   
     map.putIfAbsent('V', 5);   
     map.putIfAbsent('X', 10);   
     map.putIfAbsent('L', 50);   
     map.putIfAbsent('C', 100);   
     map.putIfAbsent('D', 500);   
     map.putIfAbsent('M', 1000);  
     
     int n = s.length();
     int ans = map.get(s.charAt(n-1));

     for (int i = n-2; i >=0; i--) {
         if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
              ans-= map.get(s.charAt(i));
         }else{
            ans += map.get(s.charAt(i));
         }
     }
     return ans;
    }
    public static void main(String[] args) {
        //Linkdin question
//         ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4));
 
// for (int i = 0; i < a.size(); i++){
//  System.out.println(i);
//     a.remove(i);
// }
// System.out.println(a);
     }
}
