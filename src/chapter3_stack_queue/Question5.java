package chapter3_stack_queue;

import java.util.Stack;

/**
 * Chapter 3 - Question 5 -
 * 
 * Implement a MyQueue class which implements a queue using two stacks.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question5 {

	private static Stack<Integer> s1 = new Stack<Integer>(),s2 = new Stack<Integer>();
	
	public static void push(Integer i){
		s1.push(i);
	}
	
	public static Integer peek(){
		if(!s2.isEmpty()){
			return s2.peek();
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	
	public static Integer pop(){
		if(!s2.isEmpty()){
			return s2.pop();
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	
	public static void print(){
		for(int i = 0; i < s2.size(); i++){
			System.out.print(s2.get(i)+",");
		}

		for(int i = s1.size()-1; i >= 0; i--){
			System.out.print(s1.get(i)+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		push(5);
		push(3);
		push(4);
		push(1);
		print();
		System.out.println("Peek: "+peek());
		System.out.println("Pop: "+pop());
		System.out.println("Peek: "+peek());
		
		
	}
}
