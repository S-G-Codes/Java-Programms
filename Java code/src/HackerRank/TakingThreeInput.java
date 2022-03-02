import java.util.Scanner;

public class TakingThreeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double db = sc.nextDouble();
        sc.nextLine();           //this will help to come out of int and will allow to take proper String
   
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("String: " + str);
        System.out.println( "Double: "+db);
        System.out.println("Int: "+n);
    }
}
