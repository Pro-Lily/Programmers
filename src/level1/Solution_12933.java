package level1;

import java.util.Arrays;

public class Solution_12933 {

	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

	public static long solution(long n) {
		long answer = 0;
		String[] strArr = String.valueOf(n).split("");
		String s = "";

		Arrays.sort(strArr);

		for (int i = strArr.length - 1; i >= 0; i--) {
			s += strArr[i];
		}

		answer = Long.parseLong(s);

		return answer;
	}

}
