package level2;

public class Solution_12924 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int answer = 1;

		for (int i = 1; i <= n / 2; i++) {
			int total = i;
			for (int j = i + 1; total < n; j++) {
				total += j;
			}
			if (total == n)
				answer++;
		}

		return answer;
	}

}