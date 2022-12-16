package level0;

public class Solution_120831 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(4));
	}

	public static int solution(int n) {
		int number = n;
		int answer = 0;
		while (n > 0) {
			if (n % 2 == 0) {
				answer += n;
				n = n - 2;
			} else {
				if (number == n) {
					n = n - 1;
					answer += n;
					n = n - 2;
				} else {
					n = n - 2;
				}
			}
		}
		return answer;
	}

}
