package level0;

public class Solution_120812 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 3, 3, 4 };
		System.out.println(solution(arr1));

		int[] arr2 = { 1, 1, 2, 2 };
		System.out.println(solution(arr2));

		int[] arr3 = { 1 };
		System.out.println(solution(arr3));
	}

	public static int solution(int[] array) {
		int answer = 0;
		int max_leng = 0;
		int max = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (max_leng < array[i]) {
				max_leng = array[i];
			}
		}

		int[] array2 = new int[max_leng + 1];

		for (int i = 0; i < array.length; i++) {
			array2[array[i]]++;
		}

		for (int i = 0; i < array2.length; i++) {
			if (max < array2[i]) {
				max = array2[i];
				answer = i;
			}
		}

		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == max) {
				count++;
			}
		}

		if (count > 1) {
			return -1;
		}
		return answer;
	}

}
