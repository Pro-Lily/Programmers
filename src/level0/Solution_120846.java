package level0;

public class Solution_120846 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int answer = 0;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				answer++;
			}
		}
		return answer;
	}

}
