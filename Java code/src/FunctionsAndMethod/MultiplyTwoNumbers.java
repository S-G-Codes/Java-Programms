import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class MultiplyTwoNumbers {

public static int Multiply(int num1, int num2){
    int sum = num1 * num2;
    return sum;

}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Multiplication of two number is: "+ Multiply(num1, num2));
    }
}
