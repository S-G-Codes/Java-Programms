import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(  n > 0){
             String str = sc.nextLine();

             try {
        Pattern.compile(str);
        System.out.println("Valid");
                 
             } catch (PatternSyntaxException e) {
                 System.out.println("Invalid");
             }
             n--;
        }
        sc.close();


    }
}
