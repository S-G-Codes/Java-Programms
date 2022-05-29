public class Max_Products_of_Word_Length {
    // https://leetcode.com/problems/maximum-product-of-word-lengths/
 static   public int maxProduct(String[] words) {
         
        int length = words.length;

        int state[] = new int[length];

        for (int i = 0; i < length; i++) {
             state[i] = getStatefromString(words[i]);
        }
           int maxProduct = 0;
        for (int i = 0; i < length; i++) {
               for (int j = 0; j < state.length; j++) {
                      if( (state[i] & state[j]) == 0    ){
                          if(words[i].length() *  words[j].length() > maxProduct){
                           maxProduct = words[i].length() *  words[j].length();
                          }
                      }
               }
        }

        return maxProduct;



    }
 static   private int getStatefromString(String string) {
            int state = 0;

            for (char c :  string.toCharArray()) {
                   int index =  c - 'a';
                //    System.out.println(index);
                   state  |=  1 << (index); 
                //    System.out.println(state);
            }
            return state;
    }
    public static void main(String[] args) {
        String words[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
          System.out.println(maxProduct(words));

        
    }
}
