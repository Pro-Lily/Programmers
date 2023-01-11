package level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution_120875 {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 4 }, { 9, 2 }, { 3, 8 }, { 11, 6 } };
		System.out.println(solution(arr1));

		int[][] arr2 = { { 3, 5 }, { 4, 1 }, { 2, 4 }, { 5, 10 } };
		System.out.println(solution(arr2));
	}

	public static int solution(int[][] dots) {
		int answer = 0;
		ArrayList<Double> list = new ArrayList<>();

		for (int i = 0; i < dots.length; i++) {
			for (int j = i + 1; j < dots.length; j++) {
				double r = (double) (dots[i][1] - dots[j][1]) / (double) (dots[i][0] - dots[j][0]);
				list.add(r);
			}
		}

		Set<Double> set = new HashSet<>(list);

		if (set.size() != list.size()) {
			answer = 1;
		}

		return answer;
	}

}
