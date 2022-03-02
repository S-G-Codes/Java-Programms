
public class PermautionOfAllString {
    public static void printPermau(String str , String Permautaion) {        //fn with Parameters two Strings 
        if(str.length()== 0){                 //base condnation  //agar str keh length == 0 hogay toh permatuation keh string print kar doh and return 
            System.out.println(Permautaion);
            return;
        }

        for (int i = 0; i < str.length(); i++) {       //a loop for indexes 
            char CurrChar = str.charAt(i);     //getting each character 
         
            String newStr = str.substring(0, i) + str.substring(i+1);  //making a new String and storing the possible permaution in it 
            printPermau(newStr  , Permautaion+CurrChar);    //Recursion call with parameters and adding the character in permauatio String 
        }
        
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermau(str, "");     //calling the fn and passing the paramters 
    }
}


//permauation is possible combination of letters in String
//math formula for permautation is nPn = n!     //n is length of String 
//so TC will be
// O(n!) 