/* BinaryTree.java: Class that counts nodes with one child
    Author Noah Parker
    07/29/2021
*/
public class BinaryTree {
        //  BinaryTree:  BinaryTree class
       public static void main(String[] args) {
        BinaryTree t4 = new BinaryTree("Savannah");   
        BinaryTree t2 = new BinaryTree("Peter", t4, null);   
        BinaryTree t3 = new BinaryTree("Zara");  
         BinaryTree t1 = new BinaryTree("Anne", t2, t3);   
        System.out.println("Size: " + t1.countNodesWithOneChild());
       }
        Node root;
        public BinaryTree(){
         // What It Does: instantiate object variables
        // How It Works: Calls to constructor
            root = null;
        }
        public BinaryTree(Object rootData){
            // What It Does: Instantiate root as null
            // How It Works: Sets object null
            root = new Node();
            root.data = rootData;
            root.left = null;
            root.right = null;
        }
        public BinaryTree(Object rootData, BinaryTree left, BinaryTree right){
            // What It Does: Initializes a binary tree
            // How It Works: Constructs a binary tree
            root = new Node();
            root.data = rootData;
            root.left = left.root;
            root.right = null;
        }
        class Node{
            //  Node:  Node class
            public Object data;
            public Node left;
            public Node right;
        }
        private static int height(Node n){
            // What It Does: Sets height of tree
            // How It Works: Instantiates height of tree
            if(n == null){
                return 0;
            }
            else{
                return 1 + Math.max(height(n.left), height(n.right));
            }
        }
        public int height(){
            // What It Does: Sets height of tree
            // How It Works: Instantiates height of tree
            return height(root);
        }
        public int countNodesWithOneChild(){
             // What It Does: Returns nodes with one child
            // How It Works: Recursion
            return countNodesWithOneChild(root);
        }
        private static int countNodesWithOneChild(Node n){
            // What It Does: Finds nodes with one child
            // How It Works: Recursion
            int nodesWithOneChild = 0;
            if(n == null){
                return 0;
            }
            else{
                if((n.left == null && n.right != null) || (n.left != null && n.right  == null)){
                    nodesWithOneChild++;
                }
                return nodesWithOneChild + countNodesWithOneChild(n.left) + countNodesWithOneChild(n.right); 
            }
        }
        public boolean isEmpty(){
            // What It Does: Checks if tree is empty
            // How It Works: Checks null value
            return root == null;
        }
        public Object data(){
             // What It Does: Returns root data
            // How It Works: Uses root.data
            return root.data;
        }
        public BinaryTree left(){
            // What It Does: Returns left leafs
            // How It Works: Uses root
            BinaryTree result = new BinaryTree();
            result.root = root.left;
            return result;
        }
        public BinaryTree right(){
            // What It Does: Returns right leafs
            // How It Works: Uses root
            BinaryTree result = new BinaryTree();
            result.root = root.right;
            return result;
        }
}
