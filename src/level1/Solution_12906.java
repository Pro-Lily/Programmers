package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_12906 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(solution(arr1)));

		int[] arr2 = { 4, 4, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();

		int check = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != check) {
				list.add(arr[i]);
				check = arr[i];
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
