package level1;

public class Solution_12948 {

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("0277778888"));
	}

	public static String solution(String phone_number) {
		int leng = phone_number.length();
		String answer = phone_number.substring(leng - 4, leng);
		String result = "";

		for (int i = 0; i < leng - 4; i++) {
			result += "*";
		}

		return result + answer;
	}

}
