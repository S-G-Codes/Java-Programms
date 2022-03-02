import java.util.Scanner;

public class Day25PrimeORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        
        for (int i = 0; i < TestCases; i++) {
           int  n = sc.nextInt();
             System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        sc.close();
    }
        static boolean isPrime(int n ){
if (n<2 ){
    return false;
}
  
for (int i = 2;  i * i <=n; i++) {
     if(n%i==0){
         return false;
     }
}
return true;

        }
        
      


    
}
