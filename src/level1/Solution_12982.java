package level1;

import java.util.Arrays;

public class Solution_12982 {

	public static void main(String[] args) {
		int[] d1 = { 1, 3, 2, 5, 4 };
		System.out.println(solution(d1, 9));

		int[] d2 = { 2, 2, 3, 3 };
		System.out.println(solution(d2, 10));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			if (budget - d[i] >= 0) {
				budget -= d[i];
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}

}
