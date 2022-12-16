package level0;

import java.util.Arrays;

public class Solution_120809 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 1, 2, 100, -99, 1, 2, 3 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] numbers) {
		return Arrays.stream(numbers).map(i -> i * 2).toArray();
	}
}
