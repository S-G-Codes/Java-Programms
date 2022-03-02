import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmltagContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      while(n-- > 0){
      String htmlLine = sc.nextLine();

      boolean matchFound = false;    
      Pattern regex = Pattern.compile("<(.+)>([^<]+)</\\1>");
      //<(.+)> //ebery content betwewn them < and > should be collected
      //([^<]+ //every thing should be collected expect this < symbol and + is for move forward
      //</\\1>  this means end  should be with </ > this tag and 1 for make sure its the same name tag which is present is first place
      //    \\ is Regex means  backreference(allows to contain more than 0 or 1 times ) and 1 here means it should match the first tag
     
      Matcher m = regex.matcher(htmlLine);  //checking if its matching with our user input

      while(m.find()){       //if match is found
          System.out.println(m.group(2));    //printing the content 
          matchFound = true;   //makeing the boolean value true 

      }
      if(!matchFound){
          System.out.println("None");
      }
    
    }

    }
}
