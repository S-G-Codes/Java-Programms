import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_of_Multiple_array {

    // https://leetcode.com/contest/weekly-contest-290/problems/intersection-of-multiple-arrays/
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();

    for (int[] i : nums) {
         for (int j : i) {
              map.put(j, map.getOrDefault(j, 0) +1);

         }
    }


      for(Map.Entry m : map.entrySet() ){
          if((int)m.getValue() == nums.length){
               list.add((int)m.getKey());
          }
      }

      Collections.sort(list);
      return list;

        }
    public static void main(String[] args) {
        
    }
}
