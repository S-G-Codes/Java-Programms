import java.util.Scanner;

public class zeroand1Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
//the pattern in this question is that while printing the 1 the sum of i and j is even else odd to print 9

//outer loop for rows
for (int i = 1 ; i <=n; i++) {

    //inner loop 
    for (int j = 1; j <= i; j++) {
int sum = i+j;
        if (sum % 2 == 0) {        //even 
            System.out.print(1+" ");
        } else {
            System.out.print(0+ " ");
            
        }
    }
    System.out.println();
    
}
    }
    
}
