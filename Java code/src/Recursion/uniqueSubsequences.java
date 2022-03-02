import java.util.HashSet;

public class uniqueSubsequences {
    public static void subSequences(String str, int indexx , String newStr , HashSet<String> set) {
        if(indexx == str.length()){
           if(set.contains(newStr)){
        return;
           }else{
               System.out.println(newStr);
               set.add(newStr);
               return;
           }
        }
char currChar = str.charAt(indexx);
        //to join us
        subSequences(str,  indexx+1, newStr+ currChar , set);      //first recursion call 
        
        

        //NOT to join us  
        subSequences(str, indexx+1, newStr ,set);         //Second recursion call


   }
   public static void main(String[] args) {
       String str = "aaaaaaaaaaaaaaaaaaaaaaaa";
       HashSet <String> set = new HashSet<>();
       subSequences(str, 0, " ",set);
   }
}


