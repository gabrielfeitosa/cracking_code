package chapter1_array_string;

import java.util.Arrays;

/**
 * Chapter 1 - Question 3 -
 * 
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional buffer. NOTE: One or two additional variables are fine.
 * An extra copy of the array is not.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question3 {

	public static void removeDuplicate(char[] ch){
		if(ch == null) return;
		System.out.println("Original: "+Arrays.toString(ch));
		if(ch.length < 2) return;
		int tail = 1;
		for (int i = 1; i < ch.length; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if(ch[i] == ch[j]) break;
			}
			if(j == tail){
				ch[tail] = ch[i];
				++tail;
			}
		}
		if(tail < ch.length)
			ch[tail] = 0;
		System.out.println("Modificado: "+Arrays.toString(ch));
	}
	
	public static void main(String[] args) {
		removeDuplicate(null);
		removeDuplicate("".toCharArray());
		removeDuplicate("a".toCharArray());
		removeDuplicate("ab".toCharArray());
		removeDuplicate("abac".toCharArray());
		removeDuplicate("aaacbb".toCharArray());
	}
}
