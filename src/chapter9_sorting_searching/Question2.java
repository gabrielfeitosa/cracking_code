package chapter9_sorting_searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Chapter 9 - Question 2 -
 * 
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question2 {

	private static void sort(String[] words) {
		List<String> w = Arrays.asList(words);
		Collections.sort(w, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				char[] a = o1.toCharArray();
				char[] b = o2.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				return new String(a).compareTo(new String(b));
			}
		});
	}

	
	public static void main(String[] args) {
		String[] words = {"rota","rato","love","ator","levo"};
		sort(words);
	}

}
