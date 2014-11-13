package chapter1_array_string;

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
