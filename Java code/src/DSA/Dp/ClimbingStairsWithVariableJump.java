import java.util.Scanner;

public class ClimbingStairsWithVariableJump {

    //url https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-with-variable-jumps-official/ojquestion
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
              arr[i] =  sc.nextInt();
        }

        int [] dp = new int[n+1];
        dp[n] = 1;          //bcz lets say your n is 6. so to go to 6 from 6 steps will be 1

        for (int i = n -1; i >=0; i--) {
             for (int j = 1; j <= arr[i] && i +j < dp.length; j++) {
                 dp[i] +=  dp[i + j];
             }
        }
        System.out.print(dp[0]);
    }
}
