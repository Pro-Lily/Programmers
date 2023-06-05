package level2;

import java.util.Arrays;

public class Solution_70129 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("110010101001")));
		System.out.println(Arrays.toString(solution("01110")));
		System.out.println(Arrays.toString(solution("1111111")));
	}

	public static int[] solution(String s) {
		int[] answer = new int[2];

		int zeroCnt = 0;
		int loopCnt = 0;

		while (s.length() > 1) {
			loopCnt++;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					zeroCnt++;
				}
			}

			s = s.replaceAll("0", "");
			s = String.valueOf(Integer.toBinaryString(s.length()));
		}

		answer[0] = loopCnt;
		answer[1] = zeroCnt;

		return answer;
	}

}