import java.util.Scanner;

class UsernameValidator{
    public static final String regularExpression  = "^[A-Za-z]\\w{7,29}$";

}


public class userNameVAlidation {
//[A-Za-z]  all character in between A to Z and a to z
//w{7,29}  any word character short for [a-z A-Z 0-9]
// $  The subexpression/metacharacter $ matches the end of a line.
private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
       while(n-- != 0){
        String  username = sc.nextLine();

        if(username.matches(UsernameValidator.regularExpression)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");

        }
        }
    }
}
