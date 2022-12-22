package level0;

import java.util.Arrays;

public class Solution_120835 {

	public static void main(String[] args) {
		int[] arr1 = { 3, 76, 24 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(solution(arr2)));

		int[] arr3 = { 30, 10, 23, 6, 100 };
		System.out.println(Arrays.toString(solution(arr3)));
	}

	public static int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];

		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] < emergency[j]) {
					answer[i]++;
				}
			}
			answer[i]++;
		}

		return answer;
	}

}
