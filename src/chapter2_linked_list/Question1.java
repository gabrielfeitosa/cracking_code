package chapter2_linked_list;

/**
 * Chapter 2 - Question 1 -
 * 
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question1 {
	
	public static Node removeDuplicates(Node head){
		if(head == null){
			return head;
		}
		
		Node n = head;
		Node headAux = head;
		while(headAux != null && headAux.next != null){
			if(headAux.data == n.next.data){
				if(n.next.next != null){
					n.next = n.next.next; 
				}else{
					n.next = null;
				}
			}else{
				n = n.next;
			}
			if(n.next == null){
				headAux = headAux.next;
				n = headAux;
			}
		}
		
		return head;
	}

	public static void main(String[] args) {
		Node n = new Node(2);
		n.insert(3);
		n.insert(1);
		n.insert(2);
		n.insert(3);
		n.insert(0);
		n.print();
		removeDuplicates(n).print();
		
		n = new Node(2);
		n.insert(2);
		n.print();
		removeDuplicates(n).print();

		n = new Node(2);
		n.print();
		removeDuplicates(n).print();
		
		n = new Node(2);
		n.insert(3);
		n.insert(1);
		n.insert(0);
		n.print();
		removeDuplicates(n).print();

	}
}
