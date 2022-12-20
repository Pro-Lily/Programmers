package level0;

public class Solution_120849 {

	public static void main(String[] args) {
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
	}

	public static String solution(String my_string) {
		String answer = "";

		answer = my_string.replaceAll("[aeiou]", "");

		return answer;
	}
	
}
