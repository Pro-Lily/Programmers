package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_120905 {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println(Arrays.toString(solution(3, arr1)));

		int[] arr2 = { 1, 9, 3, 10, 13, 5 };
		System.out.println(Arrays.toString(solution(5, arr2)));

		int[] arr3 = { 2, 100, 120, 600, 12, 12 };
		System.out.println(Arrays.toString(solution(12, arr3)));
	}

	public static int[] solution(int n, int[] numlist) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				list.add(numlist[i]);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
