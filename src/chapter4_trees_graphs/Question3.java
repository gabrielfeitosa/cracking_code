package chapter4_trees_graphs;


/**
 * Chapter 4 - Question 3 -
 * 
 * Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question3 {
	
	static class Node{
		public Node left,right;
		public int data;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static void print(Node node) {
		if(node != null){
			System.out.print(node.data +" ");
			print(node.left);
			print(node.right);
		}
	}	
	
	private static Node buildBinaryTree(int[] array, int start,	int end) {
		Node node = null;
		if(start <= end){
			int mid = (start + end) / 2;
			node = new Node(array[mid]);
			node.left = buildBinaryTree(array, start, mid -1);
			node.right = buildBinaryTree(array, mid+1, end);
		}
		return node;
	}

	public static void main(String[] args) {
		int len = 7;
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = i;
		}
		print(buildBinaryTree(array, 0,len-1));
	}
}
