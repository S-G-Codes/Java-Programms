import java.util.Scanner;

public class Average {

 public static int AverageOfThreeNo(int num1, int num2, int num3){
     int average = (num1 +num2 + num3 )/ 3;
     return average;
 }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Average of your three numbers are: " + AverageOfThreeNo(num1, num2, num3));
    }
}
