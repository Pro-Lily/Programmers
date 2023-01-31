package level1;

public class Solution_82612 {

	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}

	public static long solution(int price, int money, int count) {
		long answer = 0;
		long sum = 0;

		for (int i = 1; i <= count; i++) {
			sum += price * i;
		}

		answer = money - sum;

		return answer > 0 ? 0 : -answer;
	}

}
