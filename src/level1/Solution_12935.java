package level1;

import java.util.Arrays;

public class Solution_12935 {

	public static void main(String[] args) {
		int[] arr1 = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 10 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] arr) {
		if (arr.length > 1) {
			int[] answer = new int[arr.length - 1];
			int min = arr[0];

			for (int i : arr) {
				min = Math.min(i, min);
			}

			int index = 0;

			for (int i = 0; i < arr.length; i++) {
				if (min != arr[i]) {
					answer[index++] = arr[i];
				}
			}
			
			return answer;
		} else {
			int[] answer = new int[1];
			
			answer[0] = -1;
			
			return answer;
		}
	}

}
