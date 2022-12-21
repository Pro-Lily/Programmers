package level0;

public class Solution_120895 {

	public static void main(String[] args) {
		System.out.println(solution("hello", 1, 2));
		System.out.println(solution("I love you", 3, 6));
	}

	public static String solution(String my_string, int num1, int num2) {
		String[] strArray = my_string.split("");
		String tmp = strArray[num1];
		strArray[num1] = strArray[num2];
		strArray[num2] = tmp;

		return String.join("", strArray);
	}

}
