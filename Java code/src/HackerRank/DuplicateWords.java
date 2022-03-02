import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile( regex,Pattern.CASE_INSENSITIVE);   //for case senstitive
        Scanner sc = new Scanner(System.in);
        
        int noOfSentences = Integer.parseInt(sc.nextLine());

        while(noOfSentences-- > 0){

      String str = sc.nextLine();

      Matcher m = p.matcher(str);        //finding whats matching word from input
     
        while(m.find()){
            str = str.replaceAll(m.group(), m.group(1));  //finding the duplicates ones and replaceing it with none

        }
        System.out.println(str);
    }
    sc.close();
    }
}


//Explanation:

//The regex expression:

//\b : Start of a word boundary

//\w+ : Any number of word characters

//(\s+\1\b)* : Any number of space followed by word which matches the previous word and ends the word boundary. Whole thing wrapped in * helps to find more than one repetitions.