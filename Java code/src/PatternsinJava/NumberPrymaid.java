import java.util.Scanner;

public class NumberPrymaid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n : ");
    int n = sc.nextInt();

//outter loop for rows
    for (int i = 1; i <=n; i++) {
        //inner loop for spaces
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
            
        }  
        //inner loop for numbers   //printing row no , Row no times
        for (int j = 1; j<= i; j++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
  }
}
