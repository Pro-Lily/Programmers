package level0;

public class Solution_120841 {

	public static void main(String[] args) {
		int[] arr1 = { 2, 4 };
		System.out.println(solution(arr1));

		int[] arr2 = { -7, 9 };
		System.out.println(solution(arr2));
	}

	public static int solution(int[] dot) {
		if (dot[0] > 0) {
			if (dot[1] > 0) {
				return 1;
			} else {
				return 4;
			}
		} else {
			if (dot[1] > 0) {
				return 2;
			} else {
				return 3;
			}
		}
	}
	
}
