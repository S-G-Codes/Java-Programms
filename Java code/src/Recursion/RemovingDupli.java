public class RemovingDupli {
 public static boolean[] map = new boolean[26];

 public static void removeDupli(String str , int indexx , String newStr) {
     if(indexx== str.length()){
System.out.println(newStr);
return;
     }

     char currChar = str.charAt(indexx);
     if(map[currChar - 'a']){
         removeDupli(str, indexx+1, newStr);

     }else{
         newStr += currChar;
         map[currChar -'a'] = true;
         removeDupli(str, indexx+1, newStr);
     }
 }
    public static void main(String[] args) {
        // String str = "aabccdduu";
        String str = "xvfdgfdgfdgfffgfdgfdgfggggbccdduu";
        removeDupli(str, 0, "");
    }
}


//TimeComplexity O(n)