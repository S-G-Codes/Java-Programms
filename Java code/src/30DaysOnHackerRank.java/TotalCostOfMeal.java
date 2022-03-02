import java.util.Scanner;

public class TotalCostOfMeal {


    public static void TotalCostOfMeal (double mealCost, int tipPercent, int taxPercent){   //taking parameters
       double tip = mealCost*tipPercent/100;              //calcauting tip and tax in double 
       double tax = mealCost*taxPercent/100;
    int Total = (int)Math.round(mealCost+tax+tip);             //adding all the cost in integer format  //(int) before Math helps to convert double value into into int and Math.round() fn rounds off the total to the nearesst hundread 
    System.out.println(Total);
    return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mealCost = sc.nextDouble();                //taking inputs
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
       TotalCostOfMeal( mealCost,  tipPercent,  taxPercent);                   //calling the fn
      
        
    }
}


// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;
// import java.util.Scanner;

// class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

//     public static void solve(double meal_cost, int tip_percent, int tax_percent) {
//     // Write your code here
// //  double tip=meal_cost*tip_percent/100;
// //         double tax=meal_cost*tax_percent/100;
// //         int totalCost=(int)Math.round(meal_cost+tip+tax);
// //         System.out.print(totalCost);
//     }

// }

// public class Solution {
//     public static void main(String[] args) throws IOException {
// //   Scanner sc = new Scanner(System.in);
// //         double mealCost = sc.nextDouble();
// //         int tipPercent = sc.nextInt();
// //         int taxPercent = sc.nextInt();
// //        solve( meal_cost,  tip_percent,  tax_percent);
      
//     }
// }