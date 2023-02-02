package level1;

import java.util.Arrays;

public class Solution_12915 {

	public static void main(String[] args) {
		String[] strings1 = { "sun", "bed", "car" };
		System.out.println(Arrays.toString(solution(strings1, 1)));

		String[] strings2 = { "abce", "abcd", "cdx" };
		System.out.println(Arrays.toString(solution(strings2, 2)));
	}

	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		for (int i = 0; i < strings.length; i++) {
			answer[i] = "";
			answer[i] += strings[i].charAt(n) + strings[i];
		}

		Arrays.sort(answer);

		for (int i = 0; i < answer.length; i++) {
			answer[i] = answer[i].substring(1, answer[i].length());
		}

		return answer;
	}

}
