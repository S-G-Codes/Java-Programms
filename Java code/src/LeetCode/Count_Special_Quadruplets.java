class Count_Special_Quadruplets{
    // https://leetcode.com/problems/count-special-quadruplets/
  static  public int countQuadruplets(int[] nums) {
        int count = 0;

       

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    for (int k = j2+1; k < nums.length; k++) {
                         if(nums[i] + nums[j] + nums[j2] == nums[k]){
                             count++;
                         }
                    }
                }
            }
        }
        return count;
    }
public static void main(String[] args) {
    int nums [] = {1,1,1,3,5};

    System.out.println(countQuadruplets(nums));
}
}