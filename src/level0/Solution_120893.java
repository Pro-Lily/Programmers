package level0;

public class Solution_120893 {

	public static void main(String[] args) {
		System.out.println(solution("cccCCC"));
		System.out.println(solution("abCdEfghIJ"));
	}

	// ASCII 대문자 65~90, 소문자 97~122
	public static String solution(String my_string) {
		String answer = "";
		int check = 0;
		
		for (int i = 0; i < my_string.length(); i++) {
			check = my_string.charAt(i);
			
			if (65 <= check && check <= 90) {
				answer += (char) (check + 32);
			} else if (97 <= check && check <= 122) {
				answer += (char) (check - 32);
			}
		}

		return answer;
	}

}
