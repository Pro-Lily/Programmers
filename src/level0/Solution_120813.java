package level0;

import java.util.Arrays;

public class Solution_120813 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10)));
		System.out.println(Arrays.toString(solution(15)));
	}

	public static int[] solution(int n) {
		int[] answer = new int[n / 2 + n % 2];
		int state = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[state] = i;
				state++;
			}
		}

		return answer;
	}

}
