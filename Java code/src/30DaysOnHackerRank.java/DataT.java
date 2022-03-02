import java.util.Scanner;

public class DataT {
    public static void main(String[] args) {
        int n = 4;
        double db = 3.0;
        String str = "is the best place.";

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    double  d = sc.nextDouble();
        sc.nextLine();
        StringBuilder s = new StringBuilder(sc.nextLine());

        System.out.println( i + n);
        System.out.println( d + db);
        System.out.println( s + str);
    }
}
