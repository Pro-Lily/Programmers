package level0;

public class Solution_120868 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2 };
		System.out.println(solution(arr1));

		int[] arr2 = { 3, 6 };
		System.out.println(solution(arr2));

		int[] arr3 = { 11, 7 };
		System.out.println(solution(arr3));
	}

	public static int solution(int[] sides) {
		int answer = 0;

		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);

		return max + min - (max - min) - 1;
	}

}
