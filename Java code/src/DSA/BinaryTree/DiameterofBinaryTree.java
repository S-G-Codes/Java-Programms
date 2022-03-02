public class DiameterofBinaryTree {
// url  https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

    public static int height(Node root) {
        // base cond
        if(root == null) return 0;
    
        int leftheight = height(root.left);
        int rightheight = height(root.right);
    
        int finalHeight = Math.max(leftheight, rightheight) + 1;
    
        return finalHeight;
        
    }
        // Function to return the diameter of a Binary Tree.
        int diameter(Node root) {
            // Yo // base 
        if(root == null)  return 0;
    
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        int height = height(root.left) + height(root.right) +1;
    
        return Math.max(height, Math.max(leftDiameter, rightDiameter));
        }
}
