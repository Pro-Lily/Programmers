package level0;

import java.util.Arrays;

public class Solution_120847 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(solution(arr1));

		int[] arr2 = { 0, 31, 24, 10, 1, 9 };
		System.out.println(solution(arr2));
	}

	public static int solution(int[] numbers) {
		int leng = numbers.length;
		Arrays.sort(numbers);
		return numbers[leng - 1] * numbers[leng - 2];
	}

}
