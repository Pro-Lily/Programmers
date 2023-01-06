package level0;

import java.util.Arrays;

public class Solution_120861 {

	public static void main(String[] args) {
		String[] input1 = { "left", "right", "up", "right", "right" };
		int[] board1 = { 11, 11 };
		System.out.println(Arrays.toString(solution(input1, board1)));

		String[] input2 = { "down", "down", "down", "down", "down" };
		int[] board2 = { 7, 9 };
		System.out.println(Arrays.toString(solution(input2, board2)));
	}

	public static int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];

		int n = board[0] / 2;
		int m = board[1] / 2;

		for (int i = 0; i < keyinput.length; i++) {
			switch (keyinput[i]) {
			case "left":
				if (answer[0] <= n && (n * -1) < answer[0]) {
					answer[0]--;
				}
				break;
			case "right":
				if (answer[0] < n && (n * -1) <= answer[0]) {
					answer[0]++;
				}
				break;
			case "up":
				if (answer[1] < m && (m * -1) <= answer[1]) {
					answer[1]++;
				}
				break;
			case "down":
				if (answer[1] <= m && (m * -1) < answer[1]) {
					answer[1]--;
				}
			}
		}

		return answer;
	}

}
