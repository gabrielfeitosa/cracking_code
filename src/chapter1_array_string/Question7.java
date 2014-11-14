package chapter1_array_string;

/**
 * Chapter 1 - Question 7 -
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and 
 * column is set to 0
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question7 {

	public static int[][] getMatriz(int m, int n){
		int index = 1;
		int[][] mat = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = index++;
			}
		}
		return mat;
	}
	
	public static void zerarMatriz(int[][] m, int qtL, int qtC){
		int l = 0;
		int c = 0;
		boolean out = false;
		for (l = 0; l < qtL; l++) {
			for (c = 0; c < qtC; c++) {
				if(m[l][c] == 0){out=true;break;}
			}
			if(out)break;
		}
		int aux = 0;
		while(aux < qtC){
			m[l][aux++] = 0;
		}
		
		aux = 0;
		while(aux < qtL){
			m[aux++][c] = 0;
		}
	}

	public static void main(String[] args) {
		zerarMatriz(getMatriz(5, 4), 5, 4);
	}
}
