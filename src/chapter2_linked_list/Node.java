package chapter2_linked_list;

public class Node {

	Node next;
	int data;
	
	public Node(int data){
		this.data = data;
	}
	
	public Node insert(int data){
		Node new_ = new Node(data);
		if(this.next == null){
			this.next = new_;
			return new_;
		}
		Node n = this;
		while(n.next != null){
			n = n.next; 
		}
		n.next = new_;
		return new_;
	}

	public void print() {
		System.out.print(this.data);
		Node n = this;
		while(n.next != null){
			System.out.print(", "+n.next.data);
			n = n.next;
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return data+"";
	}
}
