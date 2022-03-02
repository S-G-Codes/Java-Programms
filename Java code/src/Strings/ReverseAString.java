public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder reverse  = new StringBuilder("Hello");
        
        //Reversing a String

         for (int i = 0; i <reverse.length()/2; i++) {
             int front = i;
             int back = reverse.length() - 1 -i; //bcz length counts from 1     // (length)5-1-i(0)=> 4  let take i as 4 i.e o here in Hello    (length)5-1-i(4)=> 0  so o will be replacing at 0 index no below    
             
             //finding the character
             char frontChar = reverse.charAt(front);
             char BackChar = reverse.charAt(back);

             //Replacing the character
           reverse.setCharAt(front, BackChar);
           reverse.setCharAt(back, frontChar);
             
         }
         System.out.println(reverse);
         

         //This Codes Time complexity will be code is running till n/2 and 2 is constant so time complexity will be O(n) Big O of N.
    }
}
