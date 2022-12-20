package level0;

import java.util.Arrays;

public class Solution_120844 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		System.out.println(Arrays.toString(solution(arr1, "right")));
		
		int[] arr2 = {4, 455, 6, 4, -1, 45, 6};
		System.out.println(Arrays.toString(solution(arr2, "left")));
	}

	public static int[] solution(int[] numbers, String direction) {
		int leng = numbers.length;
		int[] answer = new int[leng];

		if (direction.equals("right")) {
			answer[0] = numbers[leng - 1];
			for (int i = 0; i < leng - 1; i++) {
				answer[i + 1] = numbers[i];
			}
		} else {
			answer[leng - 1] = numbers[0];
			for (int i = 1; i < leng; i++) {
				answer[i - 1] = numbers[i];
			}
		}

		return answer;
	}

}
