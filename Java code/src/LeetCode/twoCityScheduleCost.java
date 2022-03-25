import java.util.Arrays;

public class twoCityScheduleCost {
    
    public int twoCitySchedCost(int[][] costs) {
        int total =0;
        
        
        //here we are sorting the array of according to profit/loss we obtain from each element whoever loss is less we will select them
        //eg  - let say cost = [10,20]
        //so if we do A -B or choose to go to city A   i.e  10 - 20 = -10 means -10 loss
        // and if we choose to go to B i.e  20 - 10   =  10 loss  
        // so as we know -10   < 10  so we will choose to go to city A instead to B . Minimum cost as per question says

        
        //tc = O(nlogn)   space constant
        Arrays.sort(costs , (a,b) ->{
            return ( (a[0] - a[1]) - (b[0] - b[1]) ); 
        }  );


        for (int i = 0; i < costs.length; i++) {
            if(i < costs.length/2){
                //select city A
                total+= costs[i][0];
            }else{

                // else city B
                total+= costs[i][1];

            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        
    }
}
