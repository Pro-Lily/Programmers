package level1;

import java.util.Arrays;

public class Solution_42862 {

	public static void main(String[] args) {
		int[] lost1 = { 2, 4 };
		int[] reserve1 = { 1, 3, 5 };
		System.out.println(solution(5, lost1, reserve1));

		int[] lost2 = { 2, 4 };
		int[] reserve2 = { 3 };
		System.out.println(solution(5, lost2, reserve2));

		int[] lost3 = { 3 };
		int[] reserve3 = { 1 };
		System.out.println(solution(3, lost3, reserve3));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		// 여벌이 있는데 도난당한 경우
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					answer++;
					lost[i] = reserve[j] = -1;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
					answer++;
					reserve[j] = -1;
					break;
				}
			}
		}

		return answer;
	}

}
