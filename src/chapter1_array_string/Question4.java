package chapter1_array_string;

import java.util.Arrays;

public class Question4 {

	public static boolean anagram(char[] one, char[] other) {
		if ((one == null || other == null) || (one.length != other.length))
			return false;
		if (one.length == 0 && other.length == 0)
			return true;
		Arrays.sort(one);
		Arrays.sort(other);
		for (int i = 0; i < other.length; i++) {
			if (one[i] != other[i])
				return false;
		}
		return true;
	}

	public static boolean anagram2(char[] one, char[] other) {
		if ((one == null || other == null) || (one.length != other.length))
			return false;
		if (one.length == 0 && other.length == 0)
			return true;
		int[] ls = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		for (char c : one) {
			if (ls[c] == 0)
				++num_unique_chars;
			++ls[c];
		}

		for (int i = 0; i < other.length; ++i) {
			int c = (int) other[i];
			if (ls[c] == 0) {
				return false;
			}
			--ls[c];
			if (ls[c] == 0) {

				++num_completed_t;

				if (num_completed_t == num_unique_chars) {
					return i == other.length - 1;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(anagram("lknlkzdn".toCharArray(),"klzsnlkznf".toCharArray()));
		System.out.println(anagram("a".toCharArray(), "a".toCharArray()));
		System.out.println(anagram("aa".toCharArray(), "aa".toCharArray()));
		System.out.println(anagram("ana".toCharArray(), "ana".toCharArray()));
		System.out.println(anagram("aabba".toCharArray(), "aaabb".toCharArray()));
		System.out.println(anagram("abba".toCharArray(), "baba".toCharArray()));
		System.out.println();
		System.out.println(anagram2("lknlkzdn".toCharArray(),"klzsnlkznf".toCharArray()));
		System.out.println(anagram2("a".toCharArray(), "a".toCharArray()));
		System.out.println(anagram2("abbca".toCharArray(), "cbbaa".toCharArray()));
		System.out.println(anagram2("ana".toCharArray(), "ana".toCharArray()));
		System.out.println(anagram2("aabba".toCharArray(), "aaabb".toCharArray()));
		System.out.println(anagram2("abba".toCharArray(), "baba".toCharArray()));

	}

}
