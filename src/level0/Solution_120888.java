package level0;

public class Solution_120888 {

	public static void main(String[] args) {
		System.out.println(solution("people"));
		System.out.println(solution("We are the world"));
	}

	public static String solution(String my_string) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}

}
