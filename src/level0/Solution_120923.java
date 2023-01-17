package level0;

import java.util.Arrays;

public class Solution_120923 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(5, 15)));
		System.out.println(Arrays.toString(solution(4, 14)));
		System.out.println(Arrays.toString(solution(5, 5)));
	}

	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int cnt = total / num + (1 - num) / 2;

		for (int i = 0; i < num; i++) {
			answer[i] = cnt++;
		}

		return answer;
	}

}
