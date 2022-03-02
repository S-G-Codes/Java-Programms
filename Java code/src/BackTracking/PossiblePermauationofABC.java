public class PossiblePermauationofABC {
  public static void printPermautaion(String str, String perm , int indexx) {
    if(str.length()==0){    //if length of string became 0 then print the string and return 
        System.out.println(perm);   //base condn 
        return;

    }


     for (int i = 0; i < str.length(); i++) {
          char   currChar = str.charAt(i);       //getting a char
              
          String newStr = str.substring(0, i) + str.substring(i+1);         //removing the added i character and checking for the next character 
          printPermautaion(newStr, perm + currChar, indexx+1);   //looping through again and now adding the charcter in perm String and increasing index by 1

      }

      
  }

    public static void main(String[] args) {
        String str = "ABC";
        printPermautaion(str, "", 0);

    }
}


//Time complexity will be 
//O(n*n!)              where n is length of STring and First n is how many times n is brackTrap