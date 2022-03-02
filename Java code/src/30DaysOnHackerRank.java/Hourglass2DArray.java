import java.util.Scanner;

public class Hourglass2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] arr = new int [6] [6];              //making an 2d array of 6 by 6
  
        for (int i = 0; i < 6; i++) {                 //taking row input 
            String [] arrRowItem = sc.nextLine().split(" ");       //spliting them with  a space
            // sc.skip( " (");
            
            for (int j = 0; j < 6; j++) {            //taking coloum input
                int arrItem = Integer.parseInt(arrRowItem[j]);         
                arr[i][j] = arrItem;     //merging them 
            }
        }
        sc.close();



        int max_sum = -45;  //bcz max integer would be -9 or 9 as per our constraints and rows and colms 5  
  
        for (int i = 0; i <=3; i++) {         //why only 3 bcz hour our has length 6 integer soo only one hour glass can formed
            for (int j = 0; j <= 3; j++) {        //traversing through rows and colums 
                int current_sum = arr[i][j] + arr[i] [j+1] + arr[i]  [j+2] + arr[i+1]  [j+1] + arr[i+2] [j] + arr[i+2] [j+1] + arr[i+2] [j+2];
                 if(current_sum > max_sum){       
                    max_sum = current_sum;         //if its greater max negative sum i.e her -45 then put that into max_sum
                 }
            }
        }
        System.out.println(max_sum);
  
  
  
    }
}



// task
// Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.


//Input Format
// There are  6 lines of input, where each line contains  6 space-separated integers that describe the 2D Array .


//constraints
// 1 . -9 <= A[i][j] <=9
//2. 0<= i, j <=5

//out we want
//max sum of hourglass



