package level1;

public class Solution_12916 {

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}

	static boolean solution(String s) {
		boolean answer = true;

		int pCheck = 0;
		int yCheck = 0;

		s = s.replaceAll("[pP]", "1");
		s = s.replaceAll("[yY]", "2");

		String[] strArr = s.split("");

		for (String str : strArr) {
			if (str.equals("1")) {
				pCheck++;
			} else if (str.equals("2")) {
				yCheck++;
			}
		}

		if (pCheck != yCheck) {
			answer = false;
		}

		return answer;
	}

}
