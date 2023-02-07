package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution_42889 {
	public static void main(String[] args) {
		int[] stages1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(5, stages1)));

		int[] stages2 = { 4, 4, 4, 4, 4 };
		System.out.println(Arrays.toString(solution(4, stages2)));
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int[] success = new int[N];
		double[] check = new double[N];

		for (int i = 0; i < stages.length; i++) {
			if (stages[i] <= N) {
				success[stages[i] - 1]++;
			}
		}

		ArrayList<Double> list = new ArrayList<>();
		int user = stages.length;

		for (int i = 0; i < success.length; i++) {
			if (user == 0) {
				check[i] = 0;
			} else {
				check[i] = (double) success[i] / user;
				user -= success[i];
			}
			list.add(check[i]);
		}

		Collections.sort(list, Collections.reverseOrder());

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < check.length; j++) {
				if (list.get(i) == check[j]) {
					answer[i] = j + 1;
					check[j] = -1;
					break;
				}
			}
		}

		return answer;
	}
}
