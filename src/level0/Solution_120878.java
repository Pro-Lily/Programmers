package level0;

public class Solution_120878 {

	public static void main(String[] args) {
		System.out.println(solution(7, 20));
		System.out.println(solution(11, 22));
		System.out.println(solution(12, 21));
	}

	public static int solution(int a, int b) {
		int answer = 1;
		int num = gcd(a, b);

		// 최대공약수가 1보다 크면 약분
		if (num > 1) {
			a /= num; // 분자
			b /= num; // 분모
		}

		while (b > 1) {
			if (b % 2 == 0) {
				b /= 2;
			} else if (b % 5 == 0) {
				b /= 5;
			} else {
				answer = 2;
				break;
			}
		}

		return answer;
	}

	public static int gcd(int a, int b) {
		int result = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				result = i; // 최대공약수
			}
		}
		return result;
	}

}
