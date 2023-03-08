package level2;

public class Solution_12951 {

	public static void main(String[] args) {
		System.out.println(solution("3people unFollowed me"));
		System.out.println(solution("for the last week"));
	}

	public static String solution(String s) {
		String answer = "";
		String[] strArr = s.split(" ");

		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() == 0) {
				answer += " ";
			} else {
				answer += strArr[i].substring(0, 1).toUpperCase();
				answer += strArr[i].substring(1, strArr[i].length()).toLowerCase() + " ";
			}
		}

		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			return answer;
		}

		return answer.substring(0, answer.length() - 1);
	}

}
