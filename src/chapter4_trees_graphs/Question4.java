package chapter4_trees_graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;


/**
 * Chapter 4 - Question 4 -
 * 
 * Given a binary search tree, design an algorithm which creates a linked list of all the 
 * nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question4 {
	
	static class Node{
		public Node left,right;
		public int data;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
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

	private static Map<Integer,LinkedList<Node>> createLinkedList(Node bst) {
		Map<Integer,LinkedList<Node>> map = new HashMap<Integer, LinkedList<Node>>();
		Integer level = 0;
		LinkedList<Node> l = new LinkedList<Node>();
		l.add(bst);
		map.put(level, l);
		boolean quit = false;
		while(!quit){
			l = new LinkedList<Node>();
			for(Node n: map.get(level)){
				if(n.left != null){
					l.add(n.left);
				}
				if(n.right != null){
					l.add(n.right);
				}
			}
			if(l.isEmpty()){
				quit = true;
			}else{
				++level;
				map.put(level, l);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		int len = 7;
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = i;
		}
		Node bst = buildBinaryTree(array, 0, len-1);
		Map<Integer, LinkedList<Node>> map = createLinkedList(bst);
		for(Entry<Integer, LinkedList<Node>> entry : map.entrySet()){
			System.out.println("Level: "+entry.getKey());
			System.out.print("Nodes: ");
			for (Node n : entry.getValue()) {
				System.out.print(n.data+" ");
			}
			System.out.println("\n");
		}
	}
	
}
