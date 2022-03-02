public class Binarysearch_search_insert_position {

// Leetcode question no 35
// url = https://leetcode.com/problems/search-insert-position/

    public int searchInsert(int[] arr, int k) {
        
        //         if arr is null or has one element or the target is greater or equalto than 0th element return 0
                if(arr== null || arr.length ==0 || arr[0]>= k ){
                    return 0;
                }
                
        //         if the target is at last index return the arr's length
                if(arr[arr.length-1] < k){
                    return arr.length;
                }
                
                
                int low = 0;
                int high = arr.length -1;
                while(low<=high){
                    int mid = low + (high-low)/2;
                    if( arr[mid] ==k){
                        return mid;
                    }
                      else if(k > arr[mid]){
                        low = mid+1;
                    }else{
                          high = mid-1;
                      }
                    
                }
                
        //     finding the index to insert the target
                if(arr[high] < k ){      //agar humara target arr keh highest elemet seh be bada hai toh highest element ka index +1 return kar doh
                    return high+1;
                }
                
        //         agar target humreh arr keh sabse lowest element seh beh chota hai toh return kardoh low +1
                else if(arr[low] > k){
                    return low-1;
                }
        //         varnna low+1
                else{
                    return low+1;
                }
                
            }
    public static void main(String[] args) {
        
    }
}
