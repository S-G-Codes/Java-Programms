import java.util.Scanner;

public class Diamondpatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();


//outer loop for rows     upper half

 for (int i = 1; i <=n; i++) {

    //inner loop for spaces
    for (int j =1 ; j <=n-i; j++) {
        System.out.print(" ");
        
    }
    int star = 2 * i-1;
    for (int j = 1; j <= star; j++) {
        System.out.print("*");
        
    }
    System.out.println();
    
}
 //outer loop for rows     below half

 for (int i = n; i>=1; i--) {

    //inner loop for spaces
    for (int j =1 ; j <=n-i; j++) {
        System.out.print(" ");
        
    }
    int star = 2 *i-1;
    for (int j = 1; j <= star; j++) {
        System.out.print("*");
        
    }
    System.out.println();
 }
    
}
}
    

