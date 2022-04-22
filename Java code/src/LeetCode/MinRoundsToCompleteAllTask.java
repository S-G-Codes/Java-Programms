import java.util.HashMap;
import java.util.Map;

public class MinRoundsToCompleteAllTask {
    // https://leetcode.com/contest/weekly-contest-289/problems/minimum-rounds-to-complete-all-tasks/

    public int minimumRounds(int[] tasks) {
   
        if(tasks.length <=1) return -1;
        Map<Integer , Integer> map = new HashMap<>();

        for (int task : tasks) {
             map.put(task, map.getOrDefault(task, 0)+1);
        }

        int rounds = 0;

        for(Map.Entry<Integer , Integer> entry: map.entrySet()){

            int freq = entry.getValue();

            if(freq == 1) return -1;
            if(freq % 3 !=0){
                rounds +=  freq/3 +1;
            }else{
                rounds +=  freq/3;
            }
        }
        return rounds;

    }
    public static void main(String[] args) {
        
    }
}
