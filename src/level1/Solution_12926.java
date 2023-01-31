package level1;

public class Solution_12926 {

	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				if (c >= 'A' && c <= 'Z') {
					if (c + n > 'Z') {
						answer += (char) (c + n - 26);
					} else {
						answer += (char) (c + n);
					}
				} else if (c >= 'a' && c <= 'z') {
					if (c + n > 'z') {
						answer += (char) (c + n - 26);
					} else {
						answer += (char) (c + n);
					}
				}

			} else {
				answer += " ";
			}

		}

		return answer;
	}

}
