package chapter3_stack_queue;

import java.util.Stack;

public class Question6 {

	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> buffer = new Stack<Integer>();
		
		while(!s.isEmpty()){
			Integer e = s.pop();
			while(!buffer.isEmpty() && buffer.peek() < e){
				s.push(buffer.pop());
			}
			buffer.push(e);
		}
		return buffer;
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(4);
		s.push(6);
		s.push(1);
		s.push(3);
		s.push(0);
		s.push(2);
		System.out.println(sort(s));
	}
	
}
