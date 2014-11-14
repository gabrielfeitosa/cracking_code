package chapter3_stack_queue;

import java.util.Arrays;

/**
 * Chapter 3 - Question 1 -
 * 
 * Describe how you could use a single array to implement three stacks
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question1 {

	private static int sizeStack = 3;
	private static int[] stacks = {0,0,0};
	private static int[] elements = new int[3*sizeStack];
	
	public static void print(){
		System.out.println(Arrays.toString(elements));
	}
	
	public static void push(int stack, int value){
		int index = stack*sizeStack + stacks[stack];
		elements[index] = value;
		stacks[stack]++;
	}
	
	public static int pop(int stack){
		int index = stack*sizeStack + stacks[stack] -1;
		int e = elements[index];
		elements[index] = 0;
		stacks[stack]--;
		return e;
	}
	
	public static int peek(int stack){
		int index = stack*sizeStack + stacks[stack] -1;
		return elements[index];
	}
	
	public static boolean isEmpty(int stack){
		return stacks[stack] == 0;
	}
	
	public static void main(String[] args) {
		push(0, 10);
		push(0, 9);
		push(0, 7);
		push(1, 8);
		push(2, 100);
		print();
		System.out.println(pop(0));
		print();
		System.out.println(peek(0));
		pop(2);
		print();
		System.out.println(isEmpty(0));
		System.out.println(isEmpty(1));
		System.out.println(isEmpty(2));
	}
}
