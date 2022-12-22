package level0;

public class Solution_120912 {

	public static void main(String[] args) {
		int[] arr1 = { 7, 77, 17 };
		System.out.println(solution(arr1));

		int[] arr2 = { 10, 29 };
		System.out.println(solution(arr2));
	}

	public static int solution(int[] array) {
		int answer = 0;
		String number = "";

		for (int i = 0; i < array.length; i++) {
			number += String.valueOf(array[i]);
		}

		String[] numbers = number.split("");

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals("7")) {
				answer++;
			}
		}

		return answer;
	}

}
