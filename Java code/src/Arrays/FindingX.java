
import java.util.Scanner;

public class FindingX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int numbers [] = new int [size];

        //this searching technique is called Linear search technique

        //taking input loop
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the Array: ");
            numbers[i] = sc.nextInt();
            
        }
        //taking x
        System.out.println("Enter the x you want to find: ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] ==x){
                System.out.println("X found at index " + i);
            }
        }
    }
}