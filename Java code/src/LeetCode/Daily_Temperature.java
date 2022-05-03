import java.util.Stack;

public class Daily_Temperature {
    // https://leetcode.com/problems/daily-temperatures/

    public int[] dailyTemperatures(int[] temperatures) {
           int n = temperatures.length;

           if(n==1) return new int []{0};

           int ans[] = new int[n];

           Stack<Integer> stk = new Stack<>();

           for (int i = 0; i < n; i++) {
               
              while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                       ans[stk.peek()] +=  i  - stk.peek();
                       stk.pop();
              }
              stk.push(i);

           }

           return ans;

    }
    public static void main(String[] args) {
        
    }
}
