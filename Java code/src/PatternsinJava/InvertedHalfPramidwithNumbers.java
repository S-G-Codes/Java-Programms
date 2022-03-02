import java.util.Scanner;

public class InvertedHalfPramidwithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n: ");
        int n = sc.nextInt();


        //outer loop for rows
        for (int i = n; i >=1; i--) {
            //inner loop for numbers
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }

    }
    
}
