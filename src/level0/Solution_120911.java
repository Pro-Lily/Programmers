package level0;

import java.util.Arrays;

public class Solution_120911 {

	public static void main(String[] args) {
		System.out.println(solution("Bcad"));
		System.out.println(solution("heLLo"));
		System.out.println(solution("Python"));
	}

	public static String solution(String my_string) {
		String[] answer = my_string.toLowerCase().split("");

		Arrays.sort(answer);

		return String.join("", answer);
	}

}
