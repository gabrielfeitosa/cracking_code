package chapter9_sorting_searching;



/**
 * Chapter 9 - Question 3 -
 * 
 * Given a sorted array of n integers that has been rotated an unknown number of 
 * times, give an O(log n) algorithm that finds an element in the array. You may assume 
 * that the array was originally sorted in increasing order.
 * EXAMPLE:
 * Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
 * Output: 8 (the index of 5 in the array)
 * 
 * @see github.com/gfeitosa/cracking_code
 * 
 * @author gfeitosa 
 *
 */
public class Question3 {

	private static int search(int[] numbers, int number) {
		int start = 0;
		int end = numbers.length - 1;
		while(start <= end){
			int mid = (start + end ) / 2;
			if(number == numbers[mid]){
				return mid;
			}
			if(numbers[start] <= numbers[mid]){
				if(number > numbers[mid]){
					start = mid+1;
				}else if(number >= numbers[start]){
					end = mid-1;
				}else{
					start = mid+1;
				}
			}else if(number < numbers[mid]){
				end = mid-1;
			}else if(number <= numbers[end]){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] numbers = {9,1,2,5,6};
		System.out.println(search(numbers, 9));
		System.out.println(search(numbers, 1));
		System.out.println(search(numbers, 2));
		System.out.println(search(numbers, 5));
		System.out.println(search(numbers, 6));
	}

}
