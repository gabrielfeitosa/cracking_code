package chapter3_stack_queue;


/**
 * Chapter 3 - Question 2 -
 * 
 * How would you design a stack which, in addition to push and pop, also has a function 
 * min which returns the minimum element? Push, pop and min should all operate in O(1) time
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question2 {

	private static int pos;
	private static int[] stack = new int[10];
	private static int[] min = new int[10];
	
	public static void push(int value){
		stack[pos] = value;
		min[pos] = value <= min() ? value : min();
		++pos;
	}
	
	public static int min(){
		return pos==0 ? Integer.MAX_VALUE : min[pos-1];
	}
	
	
	public static int pop(){
		int e = stack[pos];
		stack[pos] = 0;
		min[pos] = 0;
		--pos;
		return e;
	}
	
	public static void main(String[] args) {
		push(10);
		push(5);
		System.out.println(min());
		push(6);
		System.out.println(min());
		push(5);
		push(1);
		System.out.println(min());
		pop();
		pop();
		System.out.println(min());
		pop();
		System.out.println(min());
		pop();
		System.out.println(min());

	}
}
