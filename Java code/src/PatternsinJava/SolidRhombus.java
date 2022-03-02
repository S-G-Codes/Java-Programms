import java.util.Scanner;

public class SolidRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();


        //outerLoop for rows
        for (int i = 1; i <=n; i++) {
            //printing Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
   //Printing Star
   
                
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
       
            }
            System.out.println();
        }


    }
}
