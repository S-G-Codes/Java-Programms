import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
    System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
    
}

//The isProbablePrime() method of Java BigInteger class is used to determine if the given number is prime or not. For certainty =1, this method returns true if this BigInteger is prime and false if this BigInteger is composite.


//certainty - a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty)

//So, the higher the certainty number you pass, the more certain you can be, i.e. 100 means it's prime with probability 1 - (1/2)100, which is extremely close to 1.