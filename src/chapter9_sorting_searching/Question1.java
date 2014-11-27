package chapter9_sorting_searching;

import java.util.Arrays;

/**
 * Chapter 9 - Question 1 -
 * 
 * You are given two sorted arrays, A and B, and A has a large enough buffer at the end 
 * to hold B. Write a method to merge B into A in sorted order.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question1 {

	private static void sort(int[] bigger, int[] small, int index) {
		int indexBigger = index-1;
		int indexSmall = small.length -1;
		int inputPos = bigger.length -1;
		while(indexBigger >= 0 && indexSmall >=0){
			if(bigger[indexBigger] >= small[indexSmall]){
				bigger[inputPos--] = bigger[indexBigger--];
			}else{
				bigger[inputPos--] = small[indexSmall--];
			}
		}
		
		while(indexSmall >= 0){
			bigger[inputPos--] = small[indexSmall--];
		}
	}

	
	public static void main(String[] args) {
		int[] bigger = new int[5];
		int[] small = {1,4};
		
		int index = 0;
		bigger[index++] = 2;
		bigger[index++] = 5;
		bigger[index++] = 9;
		
		sort(bigger,small,index);
		
		System.out.println(Arrays.toString(bigger));
	}

}
