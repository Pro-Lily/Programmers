package level1;

public class Solution_86491 {

	public static void main(String[] args) {
		int[][] arr1 = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		System.out.println(solution(arr1));

		int[][] arr2 = { { 10, 7 }, { 12, 3 }, { 8, 15 }, { 14, 7 }, { 5, 15 } };
		System.out.println(solution(arr2));

		int[][] arr3 = { { 14, 4 }, { 19, 6 }, { 6, 16 }, { 18, 7 }, { 7, 11 } };
		System.out.println(solution(arr3));
	}

	public static int solution(int[][] sizes) {
		int answer = 0;
		int tmp = 0;
		int maxWidth = 0, maxHeight = 0;

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] > sizes[i][1]) {
				tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}

			maxWidth = Math.max(maxWidth, sizes[i][0]);
			maxHeight = Math.max(maxHeight, sizes[i][1]);
		}

		answer = maxWidth * maxHeight;

		return answer;
	}

}
