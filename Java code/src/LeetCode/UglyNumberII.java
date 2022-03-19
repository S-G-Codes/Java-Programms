import java.util.ArrayList;
import java.util.List;

//An ugly no means which is divisible by 2,3,5   
//eg 7   7 is not divisible by any of the above no so its not an ugly no

class UglyNumberII{

    //url https://leetcode.com/problems/ugly-number-ii/
    //Tc - O(n) and space O(n)
    public int nthUglyNumber(int n) {
        if(n<=0) return 0;

        List<Integer> uglyNo = new ArrayList<>();
        // 1 is and ugly no always
        uglyNo.add(1);

        int no2Idx =0;
        int no3Idx =0;
        int no5Idx =0;


        while(uglyNo.size()<n){
         int multiof2 = uglyNo.get(no2Idx) * 2; 
         int multiof3  = uglyNo.get(no3Idx) * 3;
         int multiof5  = uglyNo.get(no5Idx) *5;

 int min = Math.min(multiof2, Math.min(multiof3, multiof5));

 uglyNo.add(min);

 if(min == multiof2) no2Idx++;
 if(min == multiof3) no3Idx++;
 if(min == multiof5) no5Idx++;


        }

        return uglyNo.get(uglyNo.size() -1);
    }













    public static void main(String[] args) {
        
    }
}