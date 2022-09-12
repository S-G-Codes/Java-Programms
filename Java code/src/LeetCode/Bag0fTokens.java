import java.util.Arrays;

public class Bag0fTokens {
    // https://leetcode.com/problems/bag-of-tokens/

    //two pointer approch
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
            int score = 0; 
            int maxScore = 0; 
          
            while(left<=right){
                if(power >= tokens[left]){
                    power -= tokens[left];
                    left++;
                    score++;
                    maxScore = Math.max(score, maxScore);
                }else if(score > 0){
                     power += tokens[right];
                     right--;
                     score--;
                }else{
                    break;
                }
            }

            return maxScore;
        }
    public static void main(String[] args) {
        
    }
}
