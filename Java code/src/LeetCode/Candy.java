import java.util.Arrays;

public class Candy {
    // https://leetcode.com/problems/candy/
    //Approch is simple
    //1 Make an array fill with all 1's (everyone should get atleast 1 candy)
    //2  Traverse from left to right check if current element +1 is > current element so in distrubation array increase there value by currentelemt +1
    //3 Traverse from right to left  check for same but also keep an eye on distribution array values bcz it got modified while travelling from left to right
    //4 Traverse the distributon array and add all the values to an count variable return count
    public int candy(int[] ratings) {
        int count = 0;
        int disturbation[] = new int[ratings.length];
          
        //distributing 1 candies to all 
        Arrays.fill(disturbation, 1);
          
        //traversing left to right first
        for(int i = 0; i< ratings.length -1;i++){
            if(ratings[i+1] > ratings[i]){
                disturbation[i+1]  = disturbation[i] +1;
            }   
        }

        //traversing right to left
        for (int i = ratings.length -1; i >0; i--) {
             if(ratings[i-1] > ratings[i]){
                if(disturbation[i-1] <= disturbation[i]){
                    disturbation[i-1] = disturbation[i] +1;
                }
             }
        }


        for (int i = 0; i < disturbation.length; i++) {
              count += disturbation[i];
        }




      return count;
    }

    public static void main(String[] args) {
        
    }
}
