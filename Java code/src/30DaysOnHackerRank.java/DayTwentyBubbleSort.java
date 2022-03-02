import java.util.Scanner;

public class DayTwentyBubbleSort {

static void bubbleSort(int [] array , int n){   //n is length if array
     int temp = 0;             // a tempory element for swapping
     int noOfswaps = 0;          //counting no of swaps
     for (int i = 0; i < n; i++) {                     
            for (int j = 0; j < n-1; j++) {          //traversing from back 
                  if(array[j]>array[j+1]){   //if the second last no is greater than last elemet 
                    temp = array[j];             //put that into temp variable
                      array[j] = array[j+1];          //now add the the next element into j
                      array[j+1] = temp;           //add to temp
                noOfswaps++;            //increasing the no of swaps
                    }                    
            }
            if(noOfswaps==0){
                break;
            }
     }
     System.out.println("Array is sorted in " + noOfswaps + "swaps.");
     System.out.println("First Element: "+array[0]);      //first elemt 
     System.out.println("Last Element: "+array[array.length-1]);  //last element 

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int [] array = new int [n];
        for (int i = 0; i < n; i++) {
              array[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(array, n);
    }
}
