package level0;

import java.util.Arrays;

public class Solution_120808 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
	}

	public static int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] answer = new int[2];
		int top = num1 * denum2 + num2 * denum1;
		int bot = num1 * num2;
		int maxi = 1;
		for (int i = 1; i <= top; i++) {
			if (top % i == 0 && bot % i == 0) {
				maxi = i;
			}
		}
		answer[0] = top / maxi;
		answer[1] = bot / maxi;
		return answer;
	}
}
