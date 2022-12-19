package level0;

import java.util.Arrays;

public class Solution_120824 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 1, 3, 5, 7 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] num_list) {
		int[] answer = new int[2];

		int left = 0; // 짝수
		int right = 0; // 홀수

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				left++;
			} else {
				right++;
			}
		}

		answer[0] = left;
		answer[1] = right;

		return answer;
	}

}
