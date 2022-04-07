import java.util.Arrays;
import java.util.PriorityQueue;

// https://leetcode.com/problems/last-stone-weight/
   // OKAY I submited twice first with using add fn and second with offer 
    // For add I got 2 ms Runtime and For offer I got 4ms 
    //Quite Strange idk why
public class LastStoneHeight {
  

    //Approch  - 
    //Questions itself say picks the heaviest elemet so priority queue
    public int lastStoneWeight(int[] stones) {
          PriorityQueue <Integer> pq = new PriorityQueue<Integer>( (a,b)  -> (b-a) );       //this will maintain our max heap
              
          for (Integer stone : stones) {
                pq.add(stone);
          }


          while(pq.size()>1){
             int FirstLargestElement = pq.poll();
             int SecondLargestElement = pq.poll();

             if(FirstLargestElement  == SecondLargestElement){
                 continue;
             }else{
                  int NewStoneofDifference = SecondLargestElement - FirstLargestElement;
                  pq.add(NewStoneofDifference);
             }
            
          }

          return pq.size() ==0 ? 0 : pq.poll();
    }
    public static void main(String[] args) {
        
    }
}
