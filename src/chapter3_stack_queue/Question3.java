package chapter3_stack_queue;

/**
 * Chapter 3 - Question 3 -
 * 
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore,
 * in real life, we would likely start a new stack when the previous stack exceeds some threshold.
 * Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of 
 * several stacks, and should create a new stack once the previous one exceeds capacity. 
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is, 
 * pop() should return the same values as it would if there were just a single stack).
 * FOLLOW UP
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question3 {
	
	private static int pos; 
	private static int stackSize = 2;
	private static int[][] setOfStack = new int[1][stackSize];
	
	
	public static void copyStack(int newLength){
		int[][] tmp = setOfStack;
		setOfStack = new int[newLength][stackSize];
		int t = newLength < tmp.length ? newLength:tmp.length;
		for (int i = 0; i < t; i++) {
			setOfStack[i] = tmp[i];
		}
	}
	
	public static void push(int value){
		if(pos+1 > stackSize){
			copyStack(setOfStack.length+1);
			pos = 0;
		}
		setOfStack[setOfStack.length-1][pos] = value;
		++pos;
	}
	
	public static int pop(){
		int e = setOfStack[setOfStack.length-1][pos-1];
		setOfStack[setOfStack.length-1][pos-1] = 0;
		if(pos-1 == 0){
			copyStack(setOfStack.length-1);
			pos = stackSize;
		}else{
			--pos;
		}
		return e;
	}
	
	public static int peek(){
		return setOfStack[setOfStack.length-1][pos-1];
	}
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		System.out.println(peek());
		System.out.println(pop());
		push(4);
		System.out.println(pop());
		System.out.println(peek());
		System.out.println(pop());
		push(7);push(9);push(8);
		System.out.println(pop());
		System.out.println(peek());
	}
}
