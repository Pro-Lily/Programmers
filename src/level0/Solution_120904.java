package level0;

public class Solution_120904 {

	public static void main(String[] args) {
		System.out.println(solution(29183, 1));
		System.out.println(solution(232443, 4));
		System.out.println(solution(123456, 7));
	}

	public static int solution(int num, int k) {
		int answer = 0;
		String[] numbers = String.valueOf(num).split("");

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].equals(String.valueOf(k))) {
				answer = i + 1;
				break;
			} else {
				answer = -1;
			}
		}

		return answer;
	}

}
