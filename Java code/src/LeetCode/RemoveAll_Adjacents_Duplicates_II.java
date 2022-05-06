import java.util.Stack;

public interface RemoveAll_Adjacents_Duplicates_II {
    // https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
    //Tc O(n)  SC O(n)
    public String removeDuplicates(String s, int k) {
      
        Stack<Pair<Character, Integer>> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(stk.isEmpty() || stk.peek().getKey() !=c){
                stk.push(new Pair<>(c , 1));
            }else{
                //same charactes
                Pair<Character, Integer> top = stk.pop();
                stk.push(new Pair<>(top.getKey() , top.getValue() +1));

                if(stk.peek().getValue() == k){
                    stk.pop();
                }
            }
        }


        String ans = "";

        while(!stk.isEmpty()){
            Pair<Character , Integer> top = stk.pop();
            int freq = top.getValue();
            while(freq-- >0){
                ans = top.getKey() + ans;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}
