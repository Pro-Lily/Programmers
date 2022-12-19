package level0;

import java.util.Arrays;

public class Solution_120819 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5500)));
		System.out.println(Arrays.toString(solution(15000)));
	}

	public static int[] solution(int money) {
		int[] answer = new int[2];

		answer[0] = money / 5500;
		answer[1] = money - (answer[0] * 5500);

		return answer;
	}

}
