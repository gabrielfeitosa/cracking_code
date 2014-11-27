package chapter9_sorting_searching;

/**
 * Chapter 9 - Question 6 -
 * 
 * Given a matrix in which each row and each column is sorted, write a method to
 * find an element in it.
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa
 *
 */
public class Question6 {

	private static boolean contains(int[][] mat, int num) {
		 int row = 0;
		 int col = mat[0].length-1;
		while (row < mat.length && col >= 0) {
			if (mat[row][col] == num) {
				return true;
			} else if (mat[row][col] < num) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int line = 3;
		int col = 3;
		int[][] mat = new int[line][col];
		int index = 0;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = index++;
			}
		}
		System.out.println(contains(mat,4));
	}

}
