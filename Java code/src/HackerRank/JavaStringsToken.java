import java.text.StringCharacterIterator;
import java.util.Scanner;

public class JavaStringsToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       sc.close();
    s = s.trim();             //all spaces removed

    if(s.length()==0){          //if string is empty  print 0
         System.out.println(0);
    }else{
        String [] splits = s.split("['!?,._@ ]+"); //this means if string contain any of those then  separate it 
        System.out.println(splits.length); //printing the length of String
        for(String str : splits)   //making a new String and spliting the words and printing it   
        System.out.println(str);
    }

       
    }
}
