package level1;

public class Solution_136798 {

	public static void main(String[] args) {
		System.out.println(solution(5, 3, 2));
		System.out.println(solution(10, 3, 2));
	}

	public static int solution(int number, int limit, int power) {
		int answer = 0;

		for (int i = 1; i <= number; i++) {
			int weight = resultDivisor(i);

			if (weight > limit) {
				answer += power;
			} else {
				answer += weight;
			}

		}

		return answer;
	}

	public static int resultDivisor(int n) {
		int count = 0;

		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				count++;
			} else if (n % i == 0) {
				count += 2;
			}
		}

		return count;
	}

}
