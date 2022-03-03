public class FindRoatationCount {

// url = https://practice.geeksforgeeks.org/problems/rotation4723/1/#

    int findKRotation(int arr[], int n) {
        int pivot = findPivot(arr);
        return pivot+1;
      }
      
      

    //   finding the pivot indexx
      static int findPivot(int arr[]){
          int low = 0;
          int high = arr.length -1;
          
          while(low<=high){
              int mid = low + (high-low)/2;
              
              if(mid < high&& arr[mid] > arr[mid+1] ){
                  return mid;
              }
              
              if(mid > low && arr[mid] < arr[mid-1]){
                  return mid-1;
              }
              
              if(arr[mid] <= arr[low]){
                  high = mid-1;
              }else{
                  low = mid+1;
              }
                  
              }
              return -1;
          }
    public static void main(String[] args) {
        
    }
}
