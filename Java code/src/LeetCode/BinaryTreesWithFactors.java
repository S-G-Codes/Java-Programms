import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {
    // https://leetcode.com/problems/binary-trees-with-factors/
    
    //tc = O(n2)
    //sc = O(n)
    
    public int numFactoredBinaryTrees(int[] arr) {
        if(arr.length ==0 || arr == null) return 0;

        Arrays.sort(arr); //(nlogn)
    
        Map<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
               long count = 1l;

               for (int j = 0; j < i; j++) {  //O(n square)
                  if(arr[i] % arr[j] ==0 && map.containsKey(arr[i]/arr[j])){
                    count += map.get(arr[j]) * map.get(arr[i]/arr[j]);

                  }
               }
               map.put(arr[i], count);
        }


        long totalCount = 0l;
        
        for(Map.Entry<Integer,Long> entry: map.entrySet()){
            totalCount += entry.getValue();
            System.out.println("Key is " + entry.getKey() + "Value is " + entry.getValue());
        }

        return (int)(totalCount % (1000000000 +7));

    }
   
    public static void main(String[] args) {
        
    }
}
