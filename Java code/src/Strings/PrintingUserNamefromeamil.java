import java.util.Scanner;

public class PrintingUserNamefromeamil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email please: ");
        String email = sc.nextLine();

        String userName = "";

for (int i = 0; i < email.length(); i++) {
    if (email.charAt(i) == '@') {
        break;
        
    } else {
        userName += email.charAt(i);
        
    }
    
}
System.out.println(userName);

    }
    
}
