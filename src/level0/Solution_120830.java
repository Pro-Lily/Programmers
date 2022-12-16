package level0;

public class Solution_120830 {

	public static void main(String[] args) {
		System.out.println(solution(10, 3));
		System.out.println(solution(64, 6));
	}

	public static int solution(int n, int k) {
		int answer = 0;
		int service = 0;

		if (n >= 10) {
			service = n / 10;
		}

		answer = (12000 * n) + (2000 * k);

		if (service > 0) {
			answer = answer - (service * 2000);
		}

		return answer;
	}

}
