import java.util.Scanner;

public class subStringAsInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

     String ans =     str.substring(start, end);
     System.out.println(ans);

    }
}
