import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        //Outerloop
        for(int i =1; i<=n; i++){
            //outer loop
            for(int j =1; j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    } 
        
    
    
}
