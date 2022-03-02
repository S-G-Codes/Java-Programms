import java.math.BigInteger;
import java.util.Scanner;

public class javaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger sum ;
        BigInteger multi;
        sum = a.add(b);
         multi = a.multiply(b);
        System.out.println(sum);

        System.out.println(multi);


    }
}
