package chapter1_array_string;

/**
 * Chapter 1 - Question 1 -
 * 
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * can not use additional data structures?
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question1 {

	public static void verify(String str){
		boolean isUnique = false;
		if(str != null && !str.isEmpty()){
			isUnique = true;
			for(int i=0; i< str.length() && isUnique;i++){
				for(int j = i+1; j <str.length();j++){
					if(str.charAt(i) == str.charAt(j)){
						isUnique = false;
						break;
					}
				}
			}
		}
		System.out.println(str +": "+isUnique);
	}
	
	public static void main(String[] args) {
		verify(null);
		verify("");
		verify("a");
		verify("aa");
		verify("aab");
		verify("ab");
		verify("abjdluir4yepskd");
		verify("abcdefghij");
	}
}
