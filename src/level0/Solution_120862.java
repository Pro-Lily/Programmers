package level0;

import java.util.Arrays;

public class Solution_120862 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, -3, 4, -5 };
		System.out.println(solution(arr1));

		int[] arr2 = { 0, -31, 24, 10, 1, 9 };
		System.out.println(solution(arr2));

		int[] arr3 = { 10, 20, 30, 5, 5, 20, 5 };
		System.out.println(solution(arr3));
	}

	public static int solution(int[] numbers) {
		Arrays.sort(numbers);

		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		return num1 > num2 ? num1 : num2;
	}

}
