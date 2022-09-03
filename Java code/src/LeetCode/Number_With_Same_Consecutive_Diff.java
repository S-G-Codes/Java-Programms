import java.util.ArrayList;
import java.util.List;

public class Number_With_Same_Consecutive_Diff {
    // https://leetcode.com/problems/numbers-with-same-consecutive-differences/
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> list = new ArrayList<>();
        if(n==1){
            list.add(0);
        }

        dfs(n,k,list,0);
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    private void dfs(int N, int K , List<Integer> list, int currNo){
        if(N<=0){
            list.add(currNo); // loop out of recussion
            return ;
        }

        for(int i=0;i<10;i++){
            if(i==0 && currNo ==0){ // skip the case of leading 0
                continue;
            } else if(i!=0&& currNo ==0){ // base case when currNo is 0
                dfs(N-1, K, list, i);
            } else if(Math.abs(currNo%10 - i)==K){
                dfs(N-1, K, list, currNo*10+ i); // adding i at the units place of the currNO (Valid case where the difference between previous digit and i is K)
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
