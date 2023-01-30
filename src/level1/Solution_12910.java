package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_12910 {

	public static void main(String[] args) {
		int[] arr1 = { 5, 9, 7, 10 };
		System.out.println(Arrays.toString(solution(arr1, 5)));

		int[] arr2 = { 2, 36, 1, 3 };
		System.out.println(Arrays.toString(solution(arr2, 1)));

		int[] arr3 = { 3, 2, 6 };
		System.out.println(Arrays.toString(solution(arr3, 10)));
	}

	public static int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if (list.size() == 0) {
			list.add(-1);
		}

		Collections.sort(list);

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
