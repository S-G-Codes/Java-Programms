public class RotateArray {


   static public void rotate(int[] nums, int k) {
    //let say nums is 100 and k = 3
    //so rotated array will be 100 again 
    //to avoid such cases

    k %= nums.length;
    // System.out.println(k);

    rotatearr(nums, 0, nums.length-1);
    rotatearr(nums, 0, k-1);
    rotatearr(nums, k, nums.length-1);


    
  }
  
  
  
 static  public void rotatearr(int[] nums, int start , int end) {
      while(start < end){
          int temp = nums[start];
          nums[start] = nums[end];
          nums[end] =temp;
          start++;
          end--;
      }           
 
  }
    public static void main(String[] args) {
        int nums [] = {1,2,3,4,5,6,7};
        int k =3;
    System.out.println(rotate(nums, k)); 
    }
}
