public class subSequences {

    public static void subSequences(String str, int indexx , String newStr) {
         if(indexx == str.length()){
             System.out.println(newStr);
             return;
         }
 char currChar = str.charAt(indexx);
         //to join us
         subSequences(str,  indexx+1, newStr+ currChar);      //first recursion call 
         
         

         //NOT to join us  
         subSequences(str, indexx+1, newStr);         //Second recursion call


    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, " ");
    }
}


//TimeComplexity 
//  O(2 raised to n)