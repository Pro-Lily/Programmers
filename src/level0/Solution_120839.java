package level0;

public class Solution_120839 {

	public static void main(String[] args) {
		System.out.println(solution("2"));
		System.out.println(solution("205"));
	}

	public static String solution(String rsp) {
		String answer = "";
		String str = "";

		for (int i = 0; i < rsp.length(); i++) {
			str = String.valueOf(rsp.charAt(i));

			if (str.equals("2")) {
				answer += "0";
			} else if (str.equals("0")) {
				answer += "5";
			} else if (str.equals("5")) {
				answer += "2";
			}
		}
		return answer;
	}

}
