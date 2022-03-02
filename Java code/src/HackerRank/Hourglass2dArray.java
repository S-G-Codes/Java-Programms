import java.util.Scanner;

public class Hourglass2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] arr = new int [6] [6];
        
        //taking input for row
        for (int i = 0; i < 6; i++) {
            String [] arrRowItems = sc.nextLine().split(" ");
      
            //for col
            for (int j = 0; j < 6; j++) {
                 int arrItem = Integer.parseInt(arrRowItems[j]);  //j is our col index
                 arr[i][j] = arrItem;        //merging them 
            }
        }
        sc.close();

       int maxValue = -45;       //bcz mqximum integers  can be -9 or 9 and row and col is 5 or 45;

       for (int i = 0; i <=3; i++) {
             for (int j = 0; j <=3; j++) {
                 int currentSum = arr[i][j] + arr[i] [j+1] + arr[i]  [j+2] + arr[i+1]  [j+1] + arr[i+2] [j] + arr[i+2] [j+1] + arr[i+2] [j+2];
                  if(currentSum > maxValue){
                      maxValue = currentSum;
                  }
                }
       }
       System.out.println(maxValue);


    }
}
