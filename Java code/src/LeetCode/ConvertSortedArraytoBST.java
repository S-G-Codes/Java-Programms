public class ConvertSortedArraytoBST {
    
    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
    public TreeNode sortedArrayToBST(int[] nums) {
           return creatingBST(nums, 0 , nums.length-1);
    }
    private TreeNode creatingBST(int[] nums, int low, int high) {
        if(low > high) return null;

        int mid = low + (high - low)/2;
        TreeNode bst = new TreeNode(nums[mid]);
        bst.left = creatingBST(nums, low, mid-1);
        bst.right = creatingBST(nums, mid+1, high);
        return bst;
    }
    public static void main(String[] args) {
        
    }
}
