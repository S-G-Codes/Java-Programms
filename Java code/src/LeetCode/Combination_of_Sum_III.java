import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combination_of_Sum_III {
    //BAckTracking Template
    // https://leetcode.com/problems/combination-sum-iii/
//  static   public List<List<Integer>> combinationSum3(int k, int n) {
//         Set<List<Integer>>  set = new HashSet<>();
//         combinationSum3Helper(set, k, n, new HashSet<>(), 1);
//         return new ArrayList<>(set);
//     }

// static    private void combinationSum3Helper(Set<List<Integer>> ans, int noOfElements, int remainingSum, Set<Integer> runningSet, int startVal) {
//         if(noOfElements ==0){
//             if(remainingSum==0){
//                 ans.add(new ArrayList<>(runningSet));
//                 return ;
//             } else {
//                 return ;
//             }
//         }

//         if(remainingSum<0){
//             return ;
//         }

//         for(int i=startVal;i<=9;i++) {

//             runningSet.add(i);
//             combinationSum3Helper(ans,noOfElements-1, remainingSum- i, runningSet, i+1);
//             runningSet.remove(i);

//         }
//     }


    static   public List<List<Integer>> combinationSum3(int k, int n) {
       Set <List<Integer>>  set = new HashSet<>();

       backTracking(set,k , n , new HashSet<>(), 1 );
       return new ArrayList<>(set);

    }

    private static void backTracking(Set<List<Integer>> ans, int nooFElemets, int reaminigSum , Set<Integer> runningSet, int StartingValue) {
                     
        if(nooFElemets ==0){
            if(reaminigSum ==0){
                ans.add(new ArrayList<>(runningSet));
                return;
            }else{
                return;
            }
        }


        if(reaminigSum <0) return;


     for (int i = StartingValue; i <=9; i++) {
           runningSet.add(i);
           backTracking(ans, nooFElemets-1, reaminigSum-i, runningSet, i+1);
           runningSet.remove(i);
     }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}
