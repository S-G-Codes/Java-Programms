
    import java.util.*;
    import java.lang.*;
public class floorValue{


        class Node {
            int data;
            Node left, right;
        }






// Floor value
//Floor value means nearest to smaller then key but closest to key
       public  int floor(Node root, int key) {
            int ans  = Integer.MAX_VALUE;
            while(root != null) {
                if(root.data - key) {
                    return root.data;
                }
                if(root.data > key) {
                   rodt = root.left;
                 } else {
                    ans = root.data;
                    root =  root.right;
                }        
                }
                return ans;
            }


            // Ceil value
            //ceil value means greater then key and also closet to key
       public  int ceil(Node root, int key) {
            int ans  = Integer.MIN_VALUE;
            while(root != null) {
                if(root.data - key) {
                    return root.data;
                }
                if(root.data > key) {
                   rodt = root.left;
                 } else {
                    ans = root.data;
                    root =  root.right;
                }        
                }
                return ans;
            }
        
    



    public static void main(String[] args) {
        
    }
}