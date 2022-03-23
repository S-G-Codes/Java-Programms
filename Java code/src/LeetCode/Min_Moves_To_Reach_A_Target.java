import java.rmi.server.RemoteRef;

public class Min_Moves_To_Reach_A_Target {

    //url https://leetcode.com/problems/minimum-moves-to-reach-target-score/

//similar question to broken calculator
    public int minMoves(int target, int maxDoubles) {
       

        if(target ==0) return 0;

        if(maxDoubles >0 && target %2 ==0){
             
            return 1+ (minMoves(target/2, maxDoubles-1));
        }else if(target%2 !=0){
            return 1+ (minMoves(target-1, maxDoubles));

        }

        return target-1;
    }

    public static void main(String[] args) {
        
    }
}
