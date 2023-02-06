package level1;

import java.util.Arrays;

public class Solution_142086 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("foobar")));
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		String[] str = s.split("");

		answer[0] = -1;

		for (int i = 1; i < str.length; i++) {
			int index = 0;
			boolean check = false;

			for (int j = i - 1; j >= 0; j--) {
				index++;

				if (str[i].equals(str[j])) {
					check = true;
					break;
				}
			}

			if (check) {
				answer[i] = index;
			} else {
				answer[i] = -1;
			}
		}

		return answer;
	}

}
