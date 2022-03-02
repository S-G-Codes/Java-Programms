import java.util.Scanner;

public class HalfPramidwithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        //Outer loop for row
        for (int i = 1; i <=n; i++) {

            //innner loop for number
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
}
