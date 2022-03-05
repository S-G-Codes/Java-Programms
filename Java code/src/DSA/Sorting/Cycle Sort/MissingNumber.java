public class MissingNumber {

    //url https://leetcode.com/problems/missing-number/
   //Amazon

    public int missingNumber(int[] arr) {
        //use bit wise operator
//         int n = nums.length;
//         int x = 0;
//         for(int i = 0; i <=n;i++){
//             x= x^i;
//         }
        
//             for(int i = 0; i < n;i++){
//             x^= nums[i];
//         }
//         return x;
        
        
        //using Cyclic Sort
        
          int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        
            // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        
         // case 2
        return arr.length;
        
    }
    
         void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        
    }
}
