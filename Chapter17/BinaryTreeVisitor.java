/* BinaryTreeVisitor.java: Class that calculates average elements in tree
    Author Noah Parker
    07/29/2021
*/
public class BinaryTreeVisitor implements Visitor{
    //  BinaryTreeVisitor:  BinaryTreeVisitor class
	private Node root;
    private int count = 0;
    private int sum = 0;
    public static void main(String[] args){   
        // What It Does: Demostrates correctness of object methods
        // How It Works: Instantiate a object and call its methods
        BinaryTreeVisitor questionTree = new BinaryTreeVisitor(1, new BinaryTreeVisitor(7,         
        new BinaryTreeVisitor(5, new BinaryTreeVisitor(6), new BinaryTreeVisitor(3)),         
        new BinaryTreeVisitor(4)), new BinaryTreeVisitor(12, new BinaryTreeVisitor(21),         
        new BinaryTreeVisitor(8, new BinaryTreeVisitor(10), new BinaryTreeVisitor(2))));
        BinaryTreeVisitor visitor = new BinaryTreeVisitor();
        questionTree.inorder(visitor);   
        System.out.println("Average: " + visitor.average());   
        System.out.println("Expected: 7.181818181818182");
    }
		public double average(){
        // What It Does: Calculates average elements in a tree
        // How It Works: Math
			return sum / (double) count;
		}
	public BinaryTreeVisitor(){
        // What It Does: Instantiate root
        // How It Works: Calls to constructor
		root = null;
	}
	public BinaryTreeVisitor(Object rootData){
        // What It Does: Instantiate root as null
        // How It Works: Sets object null
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}
	public BinaryTreeVisitor(Object rootData, BinaryTreeVisitor left, BinaryTreeVisitor right){
        // What It Does: Initializes a binary tree
        // How It Works: Constructs a binary tree
		root = new Node();
		root.data = rootData;
		root.left = left.root;
		root.right = right.root;
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
        // What It Does: Returns height of tree
        // How It Works: Uses root to find height
		return height(root);
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
	public BinaryTreeVisitor left(){
        // What It Does: Returns left leafs
        // How It Works: Uses root
		BinaryTreeVisitor result = new BinaryTreeVisitor();
		result.root = root.left;
		return result;
	}
	public BinaryTreeVisitor right(){
        // What It Does: Returns right leafs
        // How It Works: Uses root
		BinaryTreeVisitor result = new BinaryTreeVisitor();
		result.root = root.right;
		return result;
	}
	public void inorder(Visitor v){
        // What It Does: Puts visitors in order
        // How It Works: Uses Recursion
		inorder(root, v);
		
	}
	private void inorder(Node n, Visitor v){
        // What It Does: Puts visitors in order
        // How It Works: Uses Recursion
		if(n == null){
			return;
		}
		inorder(n.left, v);
		v.visit(n.data);
		inorder(n.right, v);
	}
	@Override
	public void visit(Object data){
        // What It Does: Counts all the vists
        // How It Works: Sum of visits
        count++;
        sum += Integer.valueOf(data.toString());
	}
}

