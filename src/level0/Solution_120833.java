package level0;

import java.util.Arrays;

public class Solution_120833 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(arr1, 1, 3)));

		int[] arr2 = { 1, 3, 5 };
		System.out.println(Arrays.toString(solution(arr2, 1, 2)));
	}

	public static int[] solution(int[] numbers, int num1, int num2) {
		return Arrays.copyOfRange(numbers, num1, num2 + 1);
	}

}
