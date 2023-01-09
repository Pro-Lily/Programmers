package level0;

public class Solution_120860 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 1, 2 } };
		System.out.println(solution(arr1));

		int[][] arr2 = { { -1, -1 }, { 1, 1 }, { 1, -1 }, { -1, 1 } };
		System.out.println(solution(arr2));
	}

	public static int solution(int[][] dots) {
		int x_max = -256, x_min = 256, y_max = -256, y_min = 256;

		for (int i = 0; i < dots.length; i++) {
			x_max = Math.max(x_max, dots[i][0]);
			x_min = Math.min(x_min, dots[i][0]);
			y_max = Math.max(y_max, dots[i][1]);
			y_min = Math.min(y_min, dots[i][1]);
		}

		return Math.abs((x_max - x_min) * (y_max - y_min));
	}

}
