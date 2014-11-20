package chapter3_stack_queue;

import java.util.Stack;

/**
 * Chapter 3 - Question 6 -
 * 
 * Write a program to sort a stack in ascending order. You should not make any assumptions 
 * about how the stack is implemented. The following are the only functions that 
 * should be used to write this program: push | pop | peek | isEmpty.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
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
