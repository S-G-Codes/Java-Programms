public class Paritation_into_Min_deci_binary {
    // https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
   
    //Read the question properly 
    
    public int minPartitions(String n) {
         int max = 0;     
        for (int i = 0; i < n.length(); i++) {
             if(n.charAt(i) == 9) return 9;
            max = Math.max(max, n.charAt(i) - '0');
             }   

             return max;
    }
   
    public static void main(String[] args) {
        
    }
}
