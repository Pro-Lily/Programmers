package level0;

public class Solution_120836 {

	public static void main(String[] args) {
		System.out.println(solution(20));
		System.out.println(solution(100));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer++;
			}
		}
		return answer;
	}

}
