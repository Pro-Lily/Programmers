package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution_120882 {

	public static void main(String[] args) {
		int[][] arr1 = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
		System.out.println(Arrays.toString(solution(arr1)));

		int[][] arr2 = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };
		System.out.println(Arrays.toString(solution(arr2)));
	}

	public static int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			list.add(score[i][0] + score[i][1]);
		}

		list.sort(Comparator.reverseOrder());

		for (int i = 0; i < score.length; i++) {
			answer[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
		}

		return answer;
	}

}
