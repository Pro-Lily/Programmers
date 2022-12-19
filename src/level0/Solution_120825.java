package level0;

public class Solution_120825 {

	public static void main(String[] args) {
		System.out.println(solution("hello", 3));
	}

	public static String solution(String my_string, int n) {
		String answer = "";
		String[] my_stringArray = my_string.split("");

		for (int i = 0; i < my_string.length(); i++) {
			answer += my_stringArray[i].repeat(n);
		}
		return answer;
	}

}
