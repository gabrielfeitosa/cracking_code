package chapter1_array_string;

import java.util.Arrays;

public class Question5 {

	public static void replace(char[] ch){
		if(ch == null || ch.length == 0)return;
		int totalSpace = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ')++totalSpace;
		}
		int newLength = ch.length + totalSpace*2;
		char[] chAux = new char[newLength];
		int index = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' '){
				chAux[index++] = '%';
				chAux[index++] = '2';
				chAux[index++] = '0';
			}else{
				chAux[index++] = ch[i];
			}
		}
		System.out.println("Original: "+Arrays.toString(ch));
		System.out.println("Modificado: "+Arrays.toString(chAux));
	}
	
	public static void main(String[] args) {
		replace(null);
		replace("".toCharArray());
		replace(" ".toCharArray());
		replace("a".toCharArray());
		replace("a ".toCharArray());
		replace("a a".toCharArray());
		replace("a a ".toCharArray());
		replace(" a a ".toCharArray());
	}
}
