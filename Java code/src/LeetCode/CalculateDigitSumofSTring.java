public class CalculateDigitSumofSTring {
    // https://leetcode.com/problems/calculate-digit-sum-of-a-string/
 static   public String digitSum(String s, int k) {
       
        while(s.length() >k){
        s =  helper(s , k);
        }
        return s;
      
        
    }


  static  private String helper(String s, int k){
              int i =0;
              int j= 0;
              String ans = "";
              int sum = 0;

              for(; i< s.length(); ){
                   while(j < k && i < s.length()){
                       sum += (s.charAt(i) - '0');
                  
                       j++;
                       i++;
                   }
                   ans += sum;
                   j=0;
                   sum = 0;
              }
              return ans;
    }
    public static void main(String[] args) {
        String s ="11111222223";
        int k =3;
        System.out.println(digitSum(s, k));

    }
}
