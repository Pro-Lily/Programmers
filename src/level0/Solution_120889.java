package level0;

import java.util.Arrays;

public class Solution_120889 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		System.out.println(solution(arr1));

		int[] arr2 = { 3, 6, 2 };
		System.out.println(solution(arr2));

		int[] arr3 = { 199, 72, 222 };
		System.out.println(solution(arr3));
	}

	public static int solution(int[] sides) {
		Arrays.sort(sides);
		return sides[2] < sides[0] + sides[1] ? 1 : 2;
	}

}
