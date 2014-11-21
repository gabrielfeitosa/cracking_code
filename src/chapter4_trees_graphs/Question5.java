package chapter4_trees_graphs;


/**
 * Chapter 4 - Question 5 -
 * 
 * Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node in 
 * a binary search tree where each node has a link to its parent.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question5 {

	
	static class Node{
		public Node left,right,parent;
		public int data;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			this.parent = null;
		}
		
		@Override
		public String toString() {
			return String.valueOf(data);
		}
	}
	
	private static Node buildBinaryTree(int[] array, int start,	int end) {
		Node node = null;
		if(start <= end){
			int mid = (start + end) / 2;
			node = new Node(array[mid]);
			node.left = buildBinaryTree(array, start, mid -1);
			if(node.left != null)
				node.left.parent = node;
			node.right = buildBinaryTree(array, mid+1, end);
			if(node.right != null)
			node.right.parent = node;
		}
		return node;
	}
	
	private static Node inorderSuccessor(Node node) {
		Node aux = null;
		if(node.parent == null || node.right != null){
			aux = node.right;
			if(aux == null){
				return null;
			}
			while(aux.left != null){
				aux = aux.left;
			}
		}else{
			aux = node.parent;
			while(aux != null){
				if(aux.left == node){
					return aux;
				}
				node = aux;
				aux = node.parent;
			}
		}
		return aux;
	}
	
	public static void main(String[] args) {
		int len = 7;
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = i;
		}
		Node root = buildBinaryTree(array, 0, len-1);
		Node sucessor = inorderSuccessor(root.right);
		System.out.println(sucessor);
	}
	
}
