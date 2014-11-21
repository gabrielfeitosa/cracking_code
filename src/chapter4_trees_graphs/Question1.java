package chapter4_trees_graphs;

/**
 * Chapter 4 - Question 1 -
 * 
 * Implement a function to check if a tree is balanced. For the purposes of this question, 
 * a balanced tree is defined to be a tree such that no two leaf nodes differ in distance 
 * from the root by more than one.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question1 {

	private static Node root;
	
	public static void insert(int element){
		root = insert(root, element);
	}
	
	private static Node insert(Node node, int element) {
		if(node == null){
			return new Node(element);
		}
		if(element <= node.data){
			node.left = insert(node.left,element);
		}else{
			node.right = insert(node.right,element);
		}
		
		return node;
	}

	private static void print(Node node) {
		if(node != null){
			System.out.print(node.data +" ");
			print(node.left);
			print(node.right);
		}
	}

	private static int minDepth(Node node) {
		if(node == null){
			return 0;
		}
		return 1+ (Math.min(minDepth(node.left), minDepth(node.right)));
	}
	
	private static int maxDepth(Node node) {
		if(node == null){
			return 0;
		}
		return 1+ (Math.max(maxDepth(node.left), maxDepth(node.right)));
	}	
	
	
	public static boolean isBalanced() {
		int max = maxDepth(root);
		int min = minDepth(root);
		boolean isBalanced = ((max - min) <=1);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("Is Balanced? "+isBalanced);
		return isBalanced;
		
	}

	public static void main(String[] args) {
		insert(8);
		insert(12);
		insert(10);
		insert(9);
		insert(11);
		insert(5);
		insert(4);
		print(root);
		System.out.println();
		isBalanced();
	}
	
   static class Node {
		
		public Node left,right;
		public int data;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
   }
}
