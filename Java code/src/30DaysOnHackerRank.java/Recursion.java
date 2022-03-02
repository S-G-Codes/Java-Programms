import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
       if(n ==0 || n==1) {         //base case n==0 bcz 0 factorail is 1 and also of 1
         return 1;
       }
         int n_Minus_One = factorial(n-1);              //calculating n-1
        int fac_of_N =  n * n_Minus_One;            //recursion // this for 4 , 3,2,1 and so on 
        return fac_of_N;                         //now multiplying n * n-1 i.e 5*4, 5*3 and so on 
        }

        


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int answer =  factorial(n);
      System.out.println(answer);
      sc.close();
    }
    
}
