import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//youtube = https://www.youtube.com/watch?v=UoqKvA5Qsek
//leetcode =  https://leetcode.com/problems/top-k-frequent-elements/submissions/

public class TopKFrequentElement {

    /*
     * Approch -
     * 1- Make a hashmap of Integer Integer
     * 2- run a for each loop over nums and put that in hashmap and also keep a
     * count on freq
     * 3 - get the count/freq from map using keySet() for each element (for each)
     * and store it in a variable
     * 4- Make a array list bucket and if that position i.e list[above variable] is
     * null make a list over there
     * 5- after that add our num in that place
     * 6-Traverse from back in bucketlist and also make a ans array
     * 7- Run a for loop from behind
     * 
     */

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            // map.put(num, map.getOrDefault(num, 0) +1); // one liner
            int freq = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], freq);

            maxFreq = Math.max(freq, maxFreq);

        }

        // bucket list

        List<Integer>[] bucket = new ArrayList[maxFreq + 1];

        for (int n : map.keySet()) { // traversing keys
            int freq = map.get(n); // getting there freq

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>(); // if its is null make a arraylist there for if freq is same we can
                                                  // add that in that list
            }

            bucket[freq].add(n);

        }

        int[] ans = new int[k];
        int count = 0;

        // top k elements

        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    ans[count++] = n;

                    if (count == k) {
                        return ans;
                    }
                }

            }

        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
