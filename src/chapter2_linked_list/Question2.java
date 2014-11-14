package chapter2_linked_list;

/**
 * Chapter 2 - Question 2 -
 * 
 * Implement an algorithm to find the nth to last element of a singly linked list.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question2 {

	public static Node findElement(Node n,int position){
		if(n == null){
			return n;
		}
		
		Node aux = n;
		int index = 0;
		while(aux != null){
			if(index == position){
				return aux;
			}else{
				aux = aux.next;
				++index;
			}
		}
		return null;
	}
	
	public static int getDistance(Node n){
		if(n.next == null)return 1;
		return 1+ getDistance(n.next);
	}
	
	public static Node findToLast(Node n, int position){
		if(n == null)return n;
		if(getDistance(n) == position){
			return n;
		}
		return findToLast(n.next, position);
	}
	
	public static void main(String[] args) {
		Node n = new Node(0);
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.insert(4);
		n.insert(5);
		
		System.out.println(findToLast(n, 3));
	}
}
