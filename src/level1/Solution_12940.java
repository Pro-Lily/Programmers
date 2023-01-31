package level1;

import java.util.Arrays;

public class Solution_12940 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, 12)));
		System.out.println(Arrays.toString(solution(2, 5)));
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = gcd(n, m);
		answer[1] = lcm(n, m);

		return answer;
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
