package level0;

public class Solution_120843 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println(solution(arr1, 2));

		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(solution(arr2, 5));

		int[] arr3 = { 1, 2, 3 };
		System.out.println(solution(arr3, 3));
	}

	public static int solution(int[] numbers, int k) {
		return numbers[(1 + (k - 1) * 2) % numbers.length - 1];
	}

}
