package level0;

import java.util.Arrays;

public class Solution_120890 {

	public static void main(String[] args) {
		int[] arr1 = { 3, 10, 28 };
		System.out.println(solution(arr1, 20));

		int[] arr2 = { 10, 11, 12 };
		System.out.println(solution(arr2, 13));
	}

	public static int solution(int[] array, int n) {
		int answer = 0;
		int min = 0;
		int abs = 100;

		// 가장 가까운 수가 여러 개일 경우 더 작은 수를 return 하기 위한 정렬
		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			min = Math.abs(array[i] - n);
			if (abs > min) {
				abs = min;
				answer = array[i];
			}
		}

		return answer;
	}

}
