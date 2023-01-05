package level0;

import java.util.Arrays;

public class Solution_120907 {

	public static void main(String[] args) {
		String[] str1 = { "3 - 4 = -3", "5 + 6 = 11" };
		System.out.println(Arrays.toString(solution(str1)));

		String[] str2 = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
		System.out.println(Arrays.toString(solution(str2)));
	}

	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] str = quiz[i].split(" ");
			int number = 0;
			for (int j = 0; j < str.length; j++) {
				if (j % 2 != 0) {
					if (str[j].equals("-")) {
						number = Integer.parseInt(str[j - 1]) - Integer.parseInt(str[j + 1]);
					} else if (str[j].equals("+")) {
						number = Integer.parseInt(str[j - 1]) + Integer.parseInt(str[j + 1]);
					} else if (str[j].equals("=")) {
						if (number == Integer.parseInt(str[j + 1])) {
							answer[i] = "O";
						} else {
							answer[i] = "X";
						}
					}
				}
			}
		}

		return answer;
	}

}
