import java.util.Scanner;

public class InvertHalfPramid {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the n: ");
       int n = sc.nextInt();

//One way
    //    //outer loop
    //    for(int i =1; i<=n; i++){
    //        //inner loop
    //        for(int j =1; j<=n-i+1; j++){
    //            System.out.print("* ");
    //        }
    //        System.out.println();




// second way

 //outer loop
 for(int i =n; i>=1; i--){
    //inner loop
    for(int j =1; j<=i; j++){
        System.out.print("* ");
    }
    System.out.println();


   }


       }

    
}
