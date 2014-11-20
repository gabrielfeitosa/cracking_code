package chapter4_trees_graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Chapter 4 - Question 2 -
 * 
 * Given a directed graph, design an algorithm to find out whether 
 * there is a route between two nodes.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question2 {

	private static List<Node> nodes = new ArrayList<Node>();
	
	static class Node{
		List<Node> adjacents = new ArrayList<Node>();
		int element;
		boolean visited = false;
		
		public Node(int element) {
			this.element = element;
		}
		
		public void addAdjacents(Node... adj){
			for (Node node : adj) {
				adjacents.add(node);
			}
		}
		
		private void isRoute(Node dest) {
			Queue<Node> buffer = new LinkedList<Node>();
			this.visited = true;
			buffer.add(this);
			Node aux;
			boolean isRoute = false;
			while(!isRoute && !buffer.isEmpty()){
				aux = buffer.remove();
				if(aux != null){
					for (Node node : aux.adjacents) {
						if(!node.visited){
							if(node.element == dest.element){
								isRoute = true;
								break;
							}
							node.visited = true;
							buffer.add(node);
						}
					}
				}
			}
			System.out.println("Is there a route between "+this.element+" and "+dest.element+" ?"+isRoute);
			clear();
		}
	}
	
	private static void clear() {
		for (Node node : nodes) {
			node.visited = false;
		}
	}
	
	private static Node newNode(int element){
		Node n = new Node(element);
		nodes.add(n);
		return n;
	}
	
	public static void main(String[] args) {
		Node node1 = newNode(1);
		Node node2 = newNode(2);
		Node node3 = newNode(3);
		Node node4 = newNode(4);
		Node node5 = newNode(5);
		Node node6 = newNode(6);
		
		node1.addAdjacents(node2,node3);
		node2.addAdjacents(node5);
		node3.addAdjacents(node4);
		node4.addAdjacents(node1);
		node5.addAdjacents(node1);
		node6.addAdjacents(node1);
		
		node1.isRoute(node5);
		node2.isRoute(node4);
		node4.isRoute(node5);
		node4.isRoute(node6);
		
	}

}
