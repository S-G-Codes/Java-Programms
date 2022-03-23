public class BrokenCaluculator {
    //url https://leetcode.com/problems/broken-calculator/

 static   public int brokenCalc(int startValue, int target) {
       if(startValue >= target) return startValue-target;      //if our start is bigger than target then we will need start - target operation eg  start 8 and target 5  so ans  8 -5 = 3 so 3 operation will be needed


       if(target %2 ==0){                 //if our target is even we just divide it by 2
           return 1 + brokenCalc(startValue, target/2);
       }else{
           return 1 + brokenCalc(startValue, target+1);     //if its is odd add 1 to it and make it even and do the same operation 
       }

}



    public static void main(String[] args) {
        System.out.println(brokenCalc(10, 10));
    }
}
