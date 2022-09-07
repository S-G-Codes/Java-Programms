public class Construct_String_From_Binary_Tree {
    // https://leetcode.com/problems/construct-string-from-binary-tree/
   
    StringBuilder str;
     public String tree2str(TreeNode root) {
          str = new StringBuilder();
          make_A_String(root);
         return str.toString();
    }
    
    private void make_A_String(TreeNode root) {
if(root == null) return;

if(root.left == null && root.right == null){
    str.append(root.val);
    return;
}


str.append(root.val);
str.append("(");
make_A_String(root.left);
str.append(")");
if(root.right != null){
    str.append("(");
    make_A_String(root.right);
   str.append(")");
}
return;

    }

    public static void main(String[] args) {
        
    }
}
