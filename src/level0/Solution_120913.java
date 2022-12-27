package level0;

import java.util.Arrays;

public class Solution_120913 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
		System.out.println(Arrays.toString(solution("abcdef123", 3)));
	}

	public static String[] solution(String my_str, int n) {
		String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = my_str.substring(i * n, (i + 1) * n > my_str.length() ? my_str.length() : (i + 1) * n);
		}

		return answer;
	}

}
