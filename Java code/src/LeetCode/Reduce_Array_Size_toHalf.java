import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reduce_Array_Size_toHalf {
    // https://leetcode.com/problems/reduce-array-size-to-the-half/
    public int minSetSize(int[] arr) {
          int n =arr.length;
            //elemet , and its frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int elemet : arr) {
             map.put(elemet, map.getOrDefault(elemet, 0)+1);

        }

        List<Integer>  freq = new ArrayList<>(map.values());
        Collections.sort(freq , Collections.reverseOrder());

        int count = 0;
        int totalElement = n;
        int i =0;

        while(totalElement > n/2){
            totalElement = totalElement - freq.get(i);
            i++;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        
    }
}
