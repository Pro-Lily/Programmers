package level2;

public class Solution_12945 {

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(5));
	}

	public static int solution(int n) {
		int answer = 0;

		int n1 = 1, n2 = 1;

		if (n == 1 || n == 2) {
			return 1;
		} else {
			for (int i = 3; i <= n; i++) {
				answer = (n1 + n2) % 1234567;
				n1 = n2;
				n2 = answer;
			}
		}

		return answer;
	}

}