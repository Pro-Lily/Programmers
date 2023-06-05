package level2;

import java.util.Arrays;

public class Solution_42842 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 2)));
		System.out.println(Arrays.toString(solution(8, 1)));
		System.out.println(Arrays.toString(solution(24, 24)));
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int total = brown + yellow;

		for (int i = 1; i <= total; i++) {
			int col = total / i;

			if (i > col) {
				continue;
			}

			if ((i - 2) * (col - 2) == yellow) {
				answer[0] = col;
				answer[1] = i;
				break;
			}

		}

		return answer;
	}

}