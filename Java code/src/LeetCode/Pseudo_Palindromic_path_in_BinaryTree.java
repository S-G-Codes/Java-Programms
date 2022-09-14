public class Pseudo_Palindromic_path_in_BinaryTree {
    // https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/

    private int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
           
        int freq[] = new int[10];
        helper(root,freq);
        return ans;
    }
    private void helper(TreeNode root, int[] freq) {
      if(root == null){
        return;
      }

      freq[root.val]++;

          //its an leaf node
    if(root.left == null && root.right == null){
        if(isPalindromepossible(freq)){

           ans++;
        }        
        
        
                    
    }

    helper(root.left, freq);
    helper(root.right, freq);

    freq[root.val]--;

    }
    private boolean isPalindromepossible(int[] freq) {
        boolean oddFreqFound = false;
        for(int el: freq){
            if(el%2!=0){
                if(oddFreqFound){
                    return false;
                } else{
                    oddFreqFound = true;
                }

            }
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
