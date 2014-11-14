package chapter2_linked_list;

/**
 * Chapter 2 - Question 4 -
 * 
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1’s digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question4 {

	public static Node add(Node i, Node l, int c){
		if(i == null && l == null){
			Node n = null;
			if(c > 0){
				n = new Node(c);
			}
			return n;
		}
		Node result = new Node(c);
		int v = c;
		if(i != null) v+= i.data;
		if(l != null) v+= l.data;
		result.data = v % 10;
		result.next = add(i != null? i.next : null,l != null? l.next : null, v/10);
		return result;
	}
	
	public static void main(String[] args) {
		Node i = new Node(5);
		i.insert(3);
		i.insert(1);
		Node l = new Node(2);
		l.insert(9);
		l.insert(9);
		add(i,l,0).print();
	}
}
