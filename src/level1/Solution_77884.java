package level1;

public class Solution_77884 {

	public static void main(String[] args) {
		System.out.println(solution(13, 17));
		System.out.println(solution(24, 27));
	}

	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (ali(i)) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
	}

	public static boolean ali(int number) {
		int count = 0;

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}

		if (count % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
