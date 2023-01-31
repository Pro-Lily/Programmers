package level1;

public class Solution_12903 {

	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		String answer = "";
		String[] sArr = s.split("");

		if (s.length() % 2 == 0) {
			answer = sArr[s.length() / 2 - 1] + sArr[s.length() / 2];
		} else {
			answer = sArr[s.length() / 2];
		}

		return answer;
	}

}
