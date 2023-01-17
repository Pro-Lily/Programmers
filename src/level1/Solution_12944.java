package level1;

public class Solution_12944 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println(solution(arr1));

		int[] arr2 = { 5, 5 };
		System.out.println(solution(arr2));
	}

	public static double solution(int[] arr) {
		double answer = 0;

		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		answer = (double) sum / arr.length;

		return answer;
	}

}
