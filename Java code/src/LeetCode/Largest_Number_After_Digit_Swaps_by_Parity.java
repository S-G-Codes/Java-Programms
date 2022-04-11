import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Largest_Number_After_Digit_Swaps_by_Parity {
    // https://leetcode.com/contest/weekly-contest-288/problems/largest-number-after-digit-swaps-by-parity/
    public int largestInteger(int num) {
        PriorityQueue <Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue <Integer> even = new PriorityQueue<>(Collections.reverseOrder());

        String str = num + "";

        for (char c : str.toCharArray()) {
             int element = c - '0';
             if(element%2 ==0){
                 even.add(element);
             }else{
                 odd.add(element);
             }
        }




        String ans = "";
        for (char ch : str.toCharArray()) {
             int element = ch -'0';
             if(element %2 ==0){
                 ans += even.poll();
             }else{
                 ans += odd.poll();
             }

        }

     return   Integer.parseInt(ans);
    }

    // Using ArrayList

    // public int largestInteger(int num) {
    //     PriorityQueue<Integer> odd=new PriorityQueue<>(Collections.reverseOrder());
    //     PriorityQueue<Integer> even=new PriorityQueue<>(Collections.reverseOrder());
    //     ArrayList<Integer> al=new ArrayList<>();
    //     int a=num;
    //     while(a>0){
    //         int j=a%10;
    //         if(j%2==0){
    //             even.add(j);
    //             al.add(0,0);
    //         }else{
    //             odd.add(j);
    //             al.add(0,1);
    //         }
    //         a/=10;
    //     }
    //     StringBuilder b=new StringBuilder();
    //     for(int i=0;i<al.size();i++){
    //         if(al.get(i)==0){
    //             b.append(even.remove());
    //         }else{
    //             b.append(odd.remove());
    //         }
    //     }
        
    //     return Integer.parseInt(b.toString());
    // }
    public static void main(String[] args) {
        
    }
}
