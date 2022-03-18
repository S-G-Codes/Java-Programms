import java.util.ArrayList;
import java.util.HashMap;


//https://leetcode.com/problems/sort-characters-by-frequency/submissions/
//google micro or whatever
public class sortCharacterleetcode {



    //block 1 - create a map and put all the string character in it and also keep a check on its freq and max freq

   //block 2 - create a bucketlist of length maxfreq + 1(bcz of zero indexing) and run a for each loop for char ch and also get its key value pair using keySet() fn and check if value at a particular key is null make a list over there or else add that character at that position

  // bvock 3 -  create a stringbuilder for ans so now traverse that bucket list from behind  and check that if the buckets[i] is not null make a list of character and put that into it so now after that traverse through a for each loop in list and get the count of character  and again run a while loop until your count becomes  0 and add it to stringbuilder and decrease the count and then return the stringBuilder as ans by converting it into a string 
    public String frequencySort(String s) {
    
        //block 1
        HashMap<Character,Integer> map = new HashMap<>();

        int freq =0;
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            freq = map.getOrDefault(ch, 0) +1;
            map.put(ch, freq);

            maxFreq = Math.max(freq, maxFreq);
        }


        //block 2

        int bucketLen = maxFreq +1;

        List<Character>[] bucket = new List[bucketLen];

        for (char ch : map.keySet()) {

            int num = map.get(ch);
            if(bucket[num] == null){
                bucket[num] = new ArrayList<>();
            }

            bucket[num].add(ch);
            
        }



        //block  3
        StringBuilder ans = new StringBuilder();

         for (int i = bucketLen -1; i >=0  ; i--) {
            if(bucket[i] != null){
                List<Character> list = bucket[i];

                for (Character ch : list) {
                    int count = map.get(ch);
              
                    while(count > 0){
                     ans.append(ch);
                     count--;
                    }

                }
            } 
            
         }


  return ans.toString();
  


    }



    public static void main(String[] args) {
        
    }
}
