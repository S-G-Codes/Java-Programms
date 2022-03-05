public class FindKClosest {
    //url https://leetcode.com/problems/find-k-closest-elements/
    //Google Facebook


    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length -k;
        
        while(left < right){
            int mid = left + (right - left)/2;
            
            if( x - arr[mid] > arr[mid + k ] -x){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        List<Integer> ans = new LinkedList<>();
        for(int i = left ; i < left+k;i++){
            ans.add(arr[i]);
            
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
