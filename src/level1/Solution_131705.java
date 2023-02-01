package level1;

public class Solution_131705 {

	public static void main(String[] args) {
		int[] arr1 = { -2, 3, 0, 2, -5 };
		System.out.println(solution(arr1));

		int[] arr2 = { -3, -2, -1, 0, 1, 2, 3 };
		System.out.println(solution(arr2));

		int[] arr3 = { -1, 1, -1, 1 };
		System.out.println(solution(arr3));
	}

	public static int solution(int[] number) {
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < number.length - 2; i++) {
			for (int j = i + 1; j < number.length - 1; j++) {
				for (int k = j + 1; k < number.length; k++) {
					sum = number[i] + number[j] + number[k];
					if (sum == 0) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

}
