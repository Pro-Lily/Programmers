package level1;

public class Solution_12943 {

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
	}

	public static int solution(int num) {
		int answer = 0;

		while (num != 1) {
			answer++;
			if (num % 2 == 0) {
				num = num / 2;
				continue;
			} else if (num % 2 == 1) {
				num = num * 3 + 1;
				continue;
			}
			if (answer == 500) {
				answer = -1;
				break;
			}
		}

		return answer;
	}

}
