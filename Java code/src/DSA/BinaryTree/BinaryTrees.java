import java.util.*;



class BinaryTrees{
    
    // making a class node
    static class Node{
        int data;
        Node left;
        Node right;

        // its constructor
        Node(int data){
            this.data = data;
            this.left =  null;
            this.right =  null;
        }   
    }


    // a class binaray tree which will have a fn which will build our tree
    static class BinaryTree{
        static int index = -1;    //this index for traversing initalizing with -1 

        // this build tree fn will build our tree and will return the root node
        public static Node buildTree(int nodes[]) {
            index++;     //as soon as fn is call increasing our index so ot will go at 0 index
          
            if (nodes[index] == -1){       //this edge case to check is tree is null 
                return null;
            }

            Node newNode = new Node(nodes[index]);
            // building our left tree first
            newNode.left  = buildTree(nodes);
            // then right tree
            newNode.right  = buildTree(nodes);
             

return newNode;

        }
    }


    // preorder traversal   //TC = O(n)
    // for preorder its   ROOT-> then left ->then right
    public static void preorder(Node root) {
        // base cond  if root is null return nothing
        if(root == null){
            return;
        }
        //   printing our root first    
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
        
    }


    // Inorder travel   //tc = O(n)
    public static void inorder(Node root) {
        // base cond if root is null return none 
        if(root == null){
            return;
        }
    
        // traveling by rule    All left subtree -> then root ->then right subtree 
         inorder(root.left);
         System.out.print(root.data + " ");
         inorder(root.right);
    
    }


    // post order traversal    //tc = O(n)
// its like LEFTSUBTREE -> THE RIGHT SUBTREE ->then ROOT
       public static void postorder(Node root){
        //    base cond
        if(root == null){
            return;
        }

        postorder(root.left); 
        postorder(root.right);
        System.out.print(root.data); 
       }




    //    LevelOrder question print all the data level wise
    //  NOTE asked in MICROSOFT,META,ADOBE  


     public static void levelorder(Node root) {
        //  base cond
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        // traversing the queue

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
                q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
        }

        }
         
     }




    //  Question count for no of nodes
    // TC = O(n)


public static int count_Node(Node root) {
    // base cond
    if(root == null) return 0;

    int leftNodes = count_Node(root.left);
    int rightNodes = count_Node(root.right);

    return leftNodes + rightNodes +1;     //+1 for the roots count
    
}



// Question of sum of nodes  
// Tc = O(n)
public static int sumof_Nodes(Node root) {
    // base cond
    if(root == null) return 0;

    int leftNodes = sumof_Nodes(root.left);
    int rightNodes = sumof_Nodes(root.right);

    return leftNodes + rightNodes + root.data;
    
}


// Question calulate the height of a tree
// TC = O(n)

public static int height(Node root) {
    // base cond
    if(root == null) return 0;

    int leftheight = height(root.left);
    int rightheight = height(root.right);

    int finalHeight = Math.max(leftheight, rightheight) + 1;

    return finalHeight;
    
}



// Question calulate longest diameter of a tree
//   Asked in   ADOBE AND SNAPDEAL
// TC = O(n square)   how? first we are traversing for n time for diameter and second time for height so n * n = n square

// Approch1
public static int diameter(Node root) {
    // base 
    if(root == null)  return 0;

    int leftDiameter = diameter(root.left);
    int rightDiameter = diameter(root.right);
    int height = height(root.left) + height(root.right) +1;

    return Math.max(height, Math.max(leftDiameter, rightDiameter));
    
}


// Approch2
// Tc = O(n)

static class TreeInfo{
int ht;
int dia;

TreeInfo(int ht, int dia){
    this.ht = ht;
    this.dia = dia;
}
}

// here we are returning TreeInfo so height and diameter will be calculated in one time and will be return 
public static TreeInfo diameter2(Node root){
// base
if(root == null){
    return new TreeInfo(0,0);
}
// calulating leftsub tree and right subtree diameters
TreeInfo leftsub  = diameter2(root.left);
TreeInfo rightsub  = diameter2(root.right);

// calualting height of tree
int treeHeight = Math.max(leftsub.ht , rightsub.ht) +1;

// leftsubtree and rightsubtree maximum diameter
int maxleftDia = leftsub.dia;
int maxrightDia = rightsub.dia;

// left subtree and rightsubtree height and root height
int finaltreeHeight = leftsub.ht + rightsub.ht +1;

int finalDia = Math.max(Math.max(maxleftDia, maxrightDia),finaltreeHeight);

TreeInfo myInfo = new TreeInfo(treeHeight, finalDia);
return myInfo;


}



// Question  - Subtree of another tree
// Asked in - MICROSOFT,FACEBOOK AND AMAZON

// check is leetcode folder









public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    // object of class binary tree
    BinaryTree tree = new BinaryTree();

    // calling our fn buildtree and storing it into a Node root so we can print it data
    Node root = tree.buildTree(nodes);
   
    // this will print the root node data that is here is 1
    // System.out.println(root.data);


    // preorder traversal call    //TC = O(n)
    // preorder(root);    



    // inorder traversal call   //tc = O(n)
    // inorder(root);





    // post order traveral  //tc = O(n)
    // postorder(root);




    // levelorder traversal
    // excepted output
    // 1
    // 2 3
    // 4 5 6
    //    levelorder(root);





    // Count the total no of Nodes
    // 6 node should be output
    // TC = O(n)
    // System.out.println(count_Node(root)); 


    // sum of nodes
    // output should be 21

    // System.out.println(sumof_Nodes(root)); 




    // height of the tree
    // output should be 3
    // tc = O(n)
    // System.out.println(height(root)); 


    // Longest diameter of tree
    // output should be 5
    // tc = O(n square)

    // System.out.println(diameter(root));



    // Diameter of tree
    // Approch 2 with TC = O(n)

    // System.out.println(diameter2(root).dia);






}
}

