package level1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution_138477 {

	public static void main(String[] args) {
		int[] score1 = { 10, 100, 20, 150, 1, 100, 200 };
		System.out.println(Arrays.toString(solution(3, score1)));

		int[] score2 = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		System.out.println(Arrays.toString(solution(4, score2)));
	}

	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int i = 0; i < score.length; i++) {
			queue.add(score[i]);

			if (queue.size() > k) {
				queue.poll();
			}

			answer[i] = queue.peek();
		}

		return answer;
	}

}
