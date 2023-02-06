package level1;

public class Solution_12921 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			boolean check = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					check = false;
					break;
				}
			}
			if (check) {
				answer++;
			}
		}
		return answer;
	}

}
