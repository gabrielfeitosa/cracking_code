package chapter1_array_string;

/**
 * Chapter 1 - Question 8 -
 * 
 * Assume you have a method isSubstring which checks if one word is a substring of 
 * another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using 
 * only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question8 {

	public static boolean isSubstring(char[] str, char[] sub){
		if(str == null || sub == null || str.length < sub.length)return false;
		int init = 0;
		boolean achou = false;
		while(!achou && init < str.length){
			achou = true;
			char[] sub2 = getSub(str,sub.length,init);
			for (int i = 0; i < sub.length; i++) {
				if(sub[i] != sub2[i]){
					achou = false;
					++init;
					break;
				}
				
			}
		}
		return achou;
	}

	private static char[] getSub(char[] str,int lenSub, int init) {
		char[] r = new char[lenSub];
		int index = 0;
		while(index < lenSub){
			r[index++] = str[init];
			++init;
			if(init == str.length){
				init=0;
			}
		}
		return r;
	}
	
	
	
	public static void main(String[] args) {
		String str = "ABCD";
		String sub = "ABCD";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub = "CDA";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub = "DA";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub="BC";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub="AB";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub="CDAB";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));
		sub="CAB";
		System.out.println(sub+" isSubstring of "+str +"? "+isSubstring(str.toCharArray(), sub.toCharArray()));

	}
}
