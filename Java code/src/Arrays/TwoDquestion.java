import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class TwoDquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the coloums: ");
        int col = sc.nextInt();


int numbers[][] = new int[row][col];


//taking array input
 System.out.println("Enter your matrix: ");
for (int i = 0; i < row; i++) {
    for (int j = 0; j < col; j++) {
        numbers[i][j] = sc.nextInt();
    }
}

System.out.println("Enter the number you want to find in your Matrix: ");
int x = sc.nextInt();

//Outputing the Array

for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          //Comparing x
          if (numbers[i][j] == x) {
 System.out.println("x found at location  (" + i +"," + j + ")");
              
          }
        }
}

        
    }
}
