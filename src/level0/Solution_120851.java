package level0;

public class Solution_120851 {

	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123"));
	}

	public static int solution(String my_string) {
		int answer = 0;
		String[] str = my_string.split("");

		for (int i = 0; i < str.length; i++) {
			int asc = str[i].charAt(0) - '0';
			if (asc > 0 && asc < 10) {
				answer += Integer.parseInt(str[i]);
			}
		}

		return answer;
	}

}
