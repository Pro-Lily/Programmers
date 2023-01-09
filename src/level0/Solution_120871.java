package level0;

public class Solution_120871 {

	public static void main(String[] args) {
		System.out.println(solution(15));
		System.out.println(solution(40));
	}

	public static int solution(int n) {
		int answer = n;

		for (int i = 1; i <= answer; i++) {
			System.out.println("i: " + i);
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				answer++;
			}
		}

		return answer;
	}

}
