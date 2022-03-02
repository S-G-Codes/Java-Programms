public class keypadCombination {
// OLD phone keypad

   public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};    //making our keypad String


   public static void printCombo(String str , int indexx , String Combination) {      //passing parameters
       if(indexx== str.length()){         //base cond
           System.out.println(Combination);
           return;
       }



    char currChar =  str.charAt(indexx);     //getting char at each index
    
    String mapping = keypad[currChar - '0'];        //making a String 

    for (int i = 0; i < mapping.length(); i++) {           //looping through the map 
             printCombo(str, indexx+1, Combination+mapping.charAt(i));       // adding the possible char to our Combination
    }
   }




    public static void main(String[] args) {
        String str = "26";
        printCombo(str, 0, "");

    }
}


//TC
// 0(4 raised to n )           4 is constant and n is length of String 