package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_120897 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(24)));
		System.out.println(Arrays.toString(solution(29)));
	}

	public static int[] solution(int n) {
		List<Integer> answer = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer.add(i);
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

}
