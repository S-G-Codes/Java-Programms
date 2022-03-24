public class BoatsProblem {

    //url https://leetcode.com/problems/boats-to-save-people/submissions/

    public int numRescueBoats(int[] people, int limit) {
        int count =0;
        
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        
        while(start <=end){
            if(people[start] + people[end] <= limit){
                count++;
                start++;
                end--;
            }else{
                count++;
                end--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
