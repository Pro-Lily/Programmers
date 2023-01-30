package level1;

import java.util.Arrays;

public class Solution_12919 {

	public static void main(String[] args) {
		String[] arr = { "Jane", "Kim" };
		System.out.println(solution(arr));
	}

	public static String solution(String[] seoul) {
		int index = Arrays.asList(seoul).indexOf("Kim");

		return "김서방은 " + index + "에 있다";
	}

}
