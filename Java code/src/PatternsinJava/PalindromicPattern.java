import java.util.Scanner;


public class PalindromicPattern {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the n : ");
    int n = sc.nextInt();
    
    
    //outer loop for rows
   for (int i = 1; i <=n; i++) {
       
     //inner loop for spaces
      for (int j = 1; j<=n-i; j++) {
          System.out.print(" ");
      }
      //1st half number 
      for (int j =i ; j>=1; j--) {
          System.out.print(j);
      }
      //2st half number 
      for (int j =2 ; j<=i; j++) {
          System.out.print(j);
      }
      System.out.println();
   }

}
    
}
