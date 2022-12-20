package level0;

import java.util.Arrays;

public class Solution_120899 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 8, 3 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 9, 10, 11, 8 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] array) {
		int[] answer = new int[2];

		for (int i = 0; i < array.length; i++) {
			if (answer[0] < array[i]) {
				answer[0] = array[i];
				answer[1] = i;
			}
		}

		return answer;
	}

}
