package chapter1_array_string;

import java.util.Arrays;

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
