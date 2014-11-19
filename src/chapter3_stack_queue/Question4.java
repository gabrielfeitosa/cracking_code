package chapter3_stack_queue;

import java.util.Stack;

/**
 * Chapter 3 - Question 4 -
 * 
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different 
 * sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending 
 * order of size from top to bottom (e.g., each disk sits on top of an even larger one). 
 * You have the following constraints:
 * (A) Only one disk can be moved at a time.
 * (B) A disk is slid off the top of one rod onto the next rod.
 * (C) A disk can only be placed on top of a larger disk.
 * 
 * Write a program to move the disks from the first rod to the last using Stacks.  
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question4 {

	private static void moveTower(Stack<Integer> origin, Stack<Integer> dest, Stack<Integer> buffer, int n) {
		if(n > 0){
			moveTower(origin, buffer, dest, n-1);
			moveDisk(origin,dest);
			moveTower(buffer, dest,origin,n-1);
		}
	}
	
	private static void moveDisk(Stack<Integer> origin, Stack<Integer> dest) {
		Integer disk = origin.pop(); 
		dest.add(disk);
		System.out.println("Move disk "+disk+" from "+origin+" to "+dest);
	}

	public static void main(String[] args) {
		int n = 3;
		Stack<Integer> t1 = new Stack<Integer>();
		Stack<Integer> t2 = new Stack<Integer>();
		Stack<Integer> t3 = new Stack<Integer>();
		for (int i = n-1; i >= 0; i--) {
			t1.add(i);
		}
		moveTower(t1,t3,t2,n);
		System.out.println("T1 = "+t1);
		System.out.println("T2 = "+t2);
		System.out.println("T3 = "+t3);
	}
}
