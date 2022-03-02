public class heightofATree {
// url  https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1s

    int height(Node node) 
    {
        // base
        if(node == null) return 0;
        
        int leftHeight = height(node.left);
        int rightHeight =  height(node.right);
        
        int finalheight = Math.max(leftHeight,rightHeight) + 1;
        
        return finalheight;
    }
}
