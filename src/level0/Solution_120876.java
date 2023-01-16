package level0;

public class Solution_120876 {

	public static void main(String[] args) {
		int[][] arr1 = { { 0, 1 }, { 2, 5 }, { 3, 9 } };
		System.out.println(solution(arr1));

		int[][] arr2 = { { -1, 1 }, { 1, 3 }, { 3, 9 } };
		System.out.println(solution(arr2));

		int[][] arr3 = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		System.out.println(solution(arr3));
	}

	public static int solution(int[][] lines) {
		int answer = 0;
		int[] arr = new int[200];

		for (int i = 0; i < 3; i++) {
			for (int j = lines[i][0]; j < lines[i][1]; j++) {
				arr[j + 100]++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				answer++;
			}
		}

		return answer;
	}

}
