package level0;

import java.util.Arrays;

public class Solution_120886 {

	public static void main(String[] args) {
		System.out.println(solution("olleh", "hello"));
		System.out.println(solution("allpe", "apple"));
	}

	public static int solution(String before, String after) {
		int answer = 0;

		String[] beforeArr = before.split("");
		String[] afterArr = after.split("");

		Arrays.sort(beforeArr);
		Arrays.sort(afterArr);

		for (int i = 0; i < beforeArr.length; i++) {
			if (beforeArr[i].equals(afterArr[i])) {
				answer = 1;
			} else {
				answer = 0;
				break;
			}
		}

		return answer;
	}

}
