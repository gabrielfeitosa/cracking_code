package chapter2_linked_list;

import java.util.LinkedList;
import java.util.List;

public class Question5 {

	public static Node duplicated(Node head){
		if(head == null || head.next == null)return null;
		Node n = head;
		List<Node> list = new LinkedList<Node>();
		list.add(n);
		while(n.next != null){
			if(list.contains(n.next))return n.next;
			list.add(n.next);
			n = n.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = b;
		
		System.out.println(duplicated(a));
	}
}
