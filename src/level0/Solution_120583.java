package level0;

public class Solution_120583 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 5 };
		System.out.println(solution(arr1, 1));

		int[] arr2 = { 0, 2, 3, 4 };
		System.out.println(solution(arr2, 1));
	}

	public static int solution(int[] array, int n) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer++;
			}
		}
		return answer;
	}

}
