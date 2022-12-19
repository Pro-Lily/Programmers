package level0;

public class Solution_120826 {

	public static void main(String[] args) {
		System.out.println(solution("abcdef", "f"));
		System.out.println(solution("BCBdbe", "B"));
		
		System.out.println(solution2("abcdef", "f"));
		System.out.println(solution2("BCBdbe", "B"));
	}

	public static String solution(String my_string, String letter) {
		String answer = "";
		
		char[] c = my_string.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] != letter.charAt(0)) {
				answer += c[i];
			}
		}

		return answer;
	}
	
	public static String solution2(String my_string, String letter) {
		return my_string.replace(letter, "");
	}

}
