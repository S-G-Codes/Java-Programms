import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
int number = 1;

        //outer loop for rows
        for (int i = 1; i <=n; i++) {
            //inner loop
            for (int j = 1; j <=i; j++) {
                System.out.print(number +" ");
                number++;
                
            }
            System.out.println();
            
        }


    }
}
