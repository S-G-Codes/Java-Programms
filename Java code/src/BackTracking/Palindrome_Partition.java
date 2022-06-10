import java.util.List;

public class Palindrome_Partition {
    // https://leetcode.com/problems/palindrome-partitioning/
    //Approch is 
    //take the firt substring of String as a first part if that is palindrome then go for other part as second part and aslo keep doing the bracktracking thing
    //base case will if s.length ==0, we have tried all possible way add that in ans and return
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
           
        if(s == null || s.length() ==0){
            return ans;
        }
        backTracking(s , ans, new ArrayList() );

           return ans;

    }

    private void backTracking(String s, List<List<String>> ans , List<String> temp ) {
          
      

        if(s.length() == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }


        for (int i = 0; i < s.length(); i++) {
             String firstPart = s.substring(0, i+1);
              if(isPlaindrome(firstPart)){
                   temp.add(firstPart);
                   String SecondPart = s.substring(i+1 , s.length());
                   backTracking(SecondPart, ans, temp);
                   temp.remove(temp.size()-1);
              }
        }


    }

    // private boolean isPlaindrome(String s){
    //     int i =0;
    //     int j = s.length()-1;
    //     while(i< j){
    //          if(s.charAt(i) == s.charAt(j)){
    //               i++;
    //               j--;
    //          }else{
    //              return false;
    //          }
    //     }
    //     return true;

    // }

    private boolean isPlaindrome(String s){
           String reversedstr = new StringBuilder(s).reverse().toString();
           return s.equals(reversedstr);
           
    }
    public static void main(String[] args) {
        
    }
}
