package level1;

import java.util.Arrays;

public class Solution_12954 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(2, 5)));
		System.out.println(Arrays.toString(solution(4, 3)));
		System.out.println(Arrays.toString(solution(-4, 2)));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];

		for (int i = 1; i <= n; i++) {
			answer[i - 1] = (long) x * i;
		}
		
		return answer;
	}

}
