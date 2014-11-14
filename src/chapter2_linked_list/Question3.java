package chapter2_linked_list;

/**
 * Chapter 2 - Question 3 -
 * 
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 * EXAMPLE
 * Input: the node ‘c’ from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question3 {

	private static boolean deleteNode(Node n) {
		if(n == null || n.next == null)
			return false;
		Node aux = n.next;
		n.data = aux.data;
		n.next = aux.next;
		return true;
		
	}
	public static void main(String[] args) {
		Node node = new Node(0);
		node.insert(1);
		Node n = node.insert(2);
		node.insert(3);
		n =node.insert(5);
		node.print();
		System.out.println(deleteNode(n));
		node.print();
		
	}

}
