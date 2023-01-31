package level1;

public class Solution_12918 {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}

	public static boolean solution(String s) {
		boolean answer = true;

		s = s.replaceAll("[a-zA-Z]", "@");

		if (s.contains("@")) {
			return false;
		} else if (!(s.length() == 4 || s.length() == 6)) {
			return false;
		}

		return answer;
	}

}
