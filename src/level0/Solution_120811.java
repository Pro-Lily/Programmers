package level0;

import java.util.Arrays;

public class Solution_120811 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 7, 10, 11 };
		System.out.println(solution(arr1));

		int[] arr2 = { 9, -1, 0 };
		System.out.println(solution(arr2));
	}

	public static int solution(int[] array) {
		int answer = 0;
		Arrays.sort(array);
		answer = array[array.length / 2];
		return answer;
	}

}
