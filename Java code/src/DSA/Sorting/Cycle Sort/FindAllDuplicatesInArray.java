public class FindAllDuplicatesInArray {

//url https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/
//Amazon Question

    public List<Integer> findDuplicates(int[] arr) {
        
        //same cyclic sort
                   int i = 0;
      while(i<arr.length){
         

          int correctIndex = arr[i] - 1;  //as we know we have elements from 1 to n to the correct index will be element -1 position
          if(arr[i] != arr[correctIndex]){
              swap(arr, i , correctIndex);
          }
          else{
              i++;
          }
           }
        
        
        
          //finding the duplicates
          List<Integer> ans = new ArrayList<>();
          for(int j = 0 ; j< arr.length; j++){
              if(arr[j] != j+1){
                  ans.add(arr[j]);
              }
          }
          
    
     
        return ans;
    }
    
            //Swaping function
   void swap(int arr[], int first , int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp;
    }
    public static void main(String[] args) {
        
    }
}
