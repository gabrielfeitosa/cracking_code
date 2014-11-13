package chapter1_array_string;


public class Question2 {

	public static char[] reverse(char[] c){
		if(c == null || c.length == 0)
			return new char[0];
		int start = 0;
		int end = c.length-1;
		while(start <= end){
			char tmp = c[end];
			c[end] = c[start];
			c[start] = tmp;
			++start;
			--end;
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(null));
		char[] str = {};
		System.out.println(reverse(str));
		char[] str1 = {'a'};
		System.out.println(reverse(str1));
		char[] str2 = {'a','b'};
		System.out.println(reverse(str2));
		char[] str3 = {'a','b','c'};
		System.out.println(reverse(str3));
		char[] str4 = {'a','b','c','d'};
		System.out.println(reverse(str4));
		char[] str5 = {'a','b','c','d','e'};
		System.out.println(reverse(str5));

	}
}
