package level0;

import java.util.Arrays;

public class Solution_120880 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(solution(arr1, 4)));

		int[] arr2 = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
		System.out.println(Arrays.toString(solution(arr2, 30)));
	}

	public static int[] solution(int[] numlist, int n) {
		int tmp = 0;

		for (int i = 0; i < numlist.length; i++) {
			for (int j = i; j < numlist.length; j++) {
				if (Math.abs(numlist[i] - n) > Math.abs(numlist[j] - n)) {
					tmp = numlist[j];
					numlist[j] = numlist[i];
					numlist[i] = tmp;
				} else if (Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n) && numlist[i] < numlist[j]) {
					tmp = numlist[j];
					numlist[j] = numlist[i];
					numlist[i] = tmp;
				}
			}
		}

		return numlist;
	}

}
