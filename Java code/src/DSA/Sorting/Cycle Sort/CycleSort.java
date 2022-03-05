import java.util.Arrays;

public class CycleSort {
    //TC = O(N)
    //Cycle Sort Algo

    // Psedu will be
    //1.check that element is at current index
    //2. If not swap it at his current index
    //3.check the next element 

    //Shorter way to remember is
    //1.check
    //2. Swap
    //3. Move

   static void Sort(int arr[]) {
      int i = 0;
      while(i<arr.length){
          //as we know we have elements from 1 to n to the correct index will be element -1 position
          int correctIndex = arr[i] - 1;
          if(arr[i] != arr[correctIndex]){
              swap(arr, i , correctIndex);
          }else{
              i++;
          }
      }
    }

    //Swaping function
    static void swap(int arr[], int first , int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }



    public static void main(String[] args) {
      int [] arr = {3,5,2,1,4};
      Sort(arr);
      System.out.println(Arrays.toString(arr));
    }
}
