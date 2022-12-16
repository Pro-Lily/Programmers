package level0;

public class Solution_120585 {

	public static void main(String[] args) {
		int[] arr1 = { 149, 180, 192, 170 };
		System.out.println(solution(arr1, 167));

		int[] arr2 = { 180, 120, 140 };
		System.out.println(solution(arr2, 190));
	}

	public static int solution(int[] array, int height) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (height < array[i]) {
				answer++;
			}
		}
		return answer;
	}

}
