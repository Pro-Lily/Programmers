package level0;

import java.util.Arrays;

public class Solution_120817 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(arr1));
		
		int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution(arr2));
	}

	public static double solution(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}

}
