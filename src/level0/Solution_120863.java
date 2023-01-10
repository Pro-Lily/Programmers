package level0;

public class Solution_120863 {

	public static void main(String[] args) {
		System.out.println(solution("3x + 7 + x"));
		System.out.println(solution("x + x + x"));
	}

	public static String solution(String polynomial) {
		String answer = "";
		String[] str = polynomial.split(" \\+ ");
		int xNum = 0;
		int num = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("x")) {
				if (str[i].length() > 1) {
					String[] s = str[i].split("x");
					xNum += Integer.parseInt(s[0]);
				} else {
					xNum++;
				}
			} else {
				num += Integer.parseInt(str[i]);
			}
		}

		if (xNum == 1) {
			if (num > 0) {
				answer = "x + " + num;
			} else {
				answer = "x";
			}
		} else if (xNum > 1) {
			if (num > 0) {
				answer = xNum + "x + " + num;
			} else {
				answer = xNum + "x";
			}
		} else if (xNum == 0) {
			answer = String.valueOf(num);
		}

		return answer;
	}

}
