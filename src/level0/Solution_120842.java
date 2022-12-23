package level0;

import java.util.Arrays;

public class Solution_120842 {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.deepToString(solution(num1, 2)));

		int[] num2 = { 100, 95, 2, 4, 5, 6, 18, 33, 948 };
		System.out.println(Arrays.deepToString(solution(num2, 3)));
	}

	public static int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length / n][n];
		int count = 0;

		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = num_list[count];
				count++;
			}
		}

		return answer;
	}

}
