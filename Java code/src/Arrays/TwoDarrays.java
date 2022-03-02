import java.util.Scanner;

public class TwoDarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of coloumn: ");
        int coloumn = sc.nextInt();
    
        int [][]  numbers = new  int[row][coloumn]; 

//input
  //outer loop for rows
System.out.println("Enter your 2d Array: ");
  for (int i = 0; i < row; i++) { 
          //inner loop for coloums

      for (int j = 0; j < coloumn; j++) {
          numbers[i][j]  = sc.nextInt();   //taking input for rows and colums

          
      }
      
  }

  //Output
System.out.println(" Your 2d Array: ");

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < coloumn; j++) {
            System.out.print(numbers[i][j] + " ");
        }
        
    }

    }
}
