package chapter2_linked_list;

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
