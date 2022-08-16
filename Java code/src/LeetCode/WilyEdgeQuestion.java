import java.util.Scanner;

// Consider a square matrix A of size N x N and an index (X, Y). Write a program to print the Quotient Q, when the sum
// of diagonal elements of A is divided by the Single Digit Sum of A[X][Y]. Consider the diagonal which starts from
// A[0][0]. The Single Digit Sum of a number is the sum of digits of A[X][Y] done repeatedly until a single digit is found.
// Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings while reading the input or
// while printing, as these contribute to the standard output.


 


public class WilyEdgeQuestion {
   public static int quotient(int arr[][] , int x , int y,int n){
//    System.out.println("i a  in q");

        int num = arr[x][y];
         
        int quotient = getmeInSingleDigit(num);
         
        int sumofDiagonal = 0;
      
        //O(n)
        for (int i = 0; i < n; i++) {
                sumofDiagonal += arr[i][i];
        }

        int ans = sumofDiagonal/quotient;
         return ans;

    } 
    private static int getmeInSingleDigit(int num) {
//    System.out.println("i a am get");

         int result = num;
         while(result / 10 !=0){
                result = sumOfDigit(result);
         }
         return result;
}
    private static int sumOfDigit(int result) {
//    System.out.println("i a am sum");

        int lastDigit = 0;
        int sum = 0;
        
        while(result != 0){
             //getting the last digit
             lastDigit = result   % 10;
            //  System.out.println(lastDigit);
             //adding into sum
              sum = sum + lastDigit;
            //   System.out.println(sum);
           //removing the last digit from number
               result = result/10;
            //    System.out.println(result);
          }
          return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

       int x = sc.nextInt();
       int y = sc.nextInt();
   sc.close();

   System.out.println(quotient(arr, x, y, n));  
//    System.out.println("i a am done");
    }
}
