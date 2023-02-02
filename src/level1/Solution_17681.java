package level1;

import java.util.Arrays;

public class Solution_17681 {

	public static void main(String[] args) {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		System.out.println(Arrays.toString(solution(5, arr1, arr2)));

		int[] arr3 = { 46, 33, 33, 22, 31, 50 };
		int[] arr4 = { 27, 56, 19, 14, 14, 10 };

		System.out.println(Arrays.toString(solution(6, arr3, arr4)));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		String arr1Check = "";
		String arr2Check = "";

		for (int i = 0; i < n; i++) {
			arr1Check = binaryChange(arr1[i], n);
			arr2Check = binaryChange(arr2[i], n);

			String str = "";
			for (int j = 0; j < n; j++) {
				if (arr1Check.charAt(j) == '1' || arr2Check.charAt(j) == '1') {
					str += "#";
				} else {
					str += " ";
				}
			}
			answer[i] = str;
		}

		return answer;
	}

	public static String binaryChange(int number, int leng) {
		String str = "";

		while (number != 0) {
			str = number % 2 + str;
			number /= 2;
		}

		while (str.length() != leng) {
			str = "0" + str;
		}

		return str;
	}

}
