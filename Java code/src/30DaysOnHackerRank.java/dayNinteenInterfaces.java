import java.util.Scanner;

interface AdvancedArithmetic {
    int  divisorSum(int n);  
}

class Calculator implements AdvancedArithmetic{
     public int divisorSum(int n){
        int totalI=0;
         for (int i = 1; i <= n; i++) 
             if(n%i==0)
                 totalI = totalI+i;
                return totalI;
             }
}



public class dayNinteenInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        AdvancedArithmetic obj = new Calculator();
        int sum = obj.divisorSum(n);
         System.out.println("I implemented: " + obj.getClass().getInterfaces()[0].getName());
         System.out.println(sum);
    }
}
