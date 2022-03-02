public class DeleteANode {

// IMPPPPPPPP

// url  = https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1





    public static Node deleteNode(Node root, int key) {
        if(root == null) return root;  //base cond
        
        if(key < root.data){       //agar key root seh socteh hai toh left side hogi
            root.left = deleteNode(root.left , key);     //left side find kar keh delete kardoh on leaf of faith of recursion
        }else if(key > root.data){   //varna right side check karo
            root.right = deleteNode(root.right , key);
        }
        
        else{
            if(root.left == null){       //agar left side he null hai toh pakka right side hogi key
                return root.right;
            }else if (root.right == null){   //same for right side
                return root.left;
            }
            
            
            root.data = minValue(root.right);       //agar dhono non null hai toh a ek fun call karo minValue
            root.right = deleteNode(root.right,root.data);
        }
        return root;
    }
    
    // minValue humeh sabseh choteh value dekgha joh left side meh present hoghi aur woh obviously ek leaf node hogi
    
    //also joh value mileghe like minv usko key seh keh jaga replace kardoh fir humara binary tree keh sabhi property satisfied hogi
    
    static int minValue(Node root){
        int minv = root.data;   
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}
