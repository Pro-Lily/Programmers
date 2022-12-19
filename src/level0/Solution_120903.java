package level0;

public class Solution_120903 {

	public static void main(String[] args) {
		String[][] str = { { "a", "b", "c" }, { "com", "b", "d", "p", "c" }, { "n", "omg" }, { "m", "dot" } };

		System.out.println(solution(str[0], str[1]));
		System.out.println(solution(str[2], str[3]));
	}

	public static int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
		return answer;
	}

}
