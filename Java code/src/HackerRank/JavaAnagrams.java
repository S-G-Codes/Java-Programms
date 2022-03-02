import java.util.Scanner;




public class JavaAnagrams {
    public static boolean isAnagram ( String a , String b) {
        char aa [] = a.toLowerCase().toCharArray();     //tocharArray return a char array from a String 
        char bb [] = b.toLowerCase().toCharArray();     //tocharArray return a char array from a String 
  
  if(a.length() != b.length()){
      return false;

  }else{
        java.util.Arrays.sort(aa);
        java.util.Arrays.sort(bb);
        return java.util.Arrays.equals(aa, bb);
  }
  
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String b= sc.next();
 sc.close();
       boolean returnn = isAnagram(a, b);
       System.out.println((returnn) ? "Anagrams" : "Not Anagrams");

    }
}


//Steps
//1. take inputs form user
//2 . write a fn with boolean return type and two string paramters a and b
//3. make a char for and b  store a.toLowercase.toCharArray() same for b
//4. now if a.length is not equal to b.length return false
//5. else sort the char array using Array.sort(aa) and for bb also  
//6. return Array.equal(aa , and bb)