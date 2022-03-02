import java.util.Scanner;

public class DaysixteenException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        try {
              int no;
              no = Integer.parseInt(S);
              System.out.println(no);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
