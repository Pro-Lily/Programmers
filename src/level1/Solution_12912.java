package level1;

public class Solution_12912 {

	public static void main(String[] args) {
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
	}

	public static long solution(int a, int b) {
		long answer = 0;

		if (a == b)
			return a;

		long first = 0, second = 0;

		if (a > b) {
			first = b;
			second = a;
		} else {
			first = a;
			second = b;
		}

		for (long i = first; i <= second; i++) {
			answer += i;
		}

		return answer;
	}
}
