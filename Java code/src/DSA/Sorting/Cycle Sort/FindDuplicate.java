public class FindDuplicate {

//url https://leetcode.com/problems/find-the-duplicate-number/
//Amazon and Microsoft
    public int findDuplicate(int[] arr) {
        int i = 0;
          while (i < arr.length) {    //loop until array.length
   
              if (arr[i] != i + 1) {          //this checks that if no is in sorted order 
                  int correct = arr[i] - 1;      //finding its correct index 
                  if (arr[i] != arr[correct]) {         //checking if arr[i] is at is correct index if not
                      swap(arr, i , correct);    //swap them at their correctidx 
                  } else {
                      return arr[i];        //if it is at correct index return its index
                  }
              } else {
                  i++;
              }
          }
          return -1;
      }
  
      static void swap(int[] arr, int first, int second) {
          int temp = arr[first];
          arr[first] = arr[second];
          arr[second] = temp;
      }
    public static void main(String[] args) {
        
    }
}
