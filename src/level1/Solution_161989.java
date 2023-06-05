package level1;

public class Solution_161989 {

	public static void main(String[] args) {
		int[] section = { 2, 3, 6 };
		System.out.println(solution(8, 4, section));
	}

	public static int solution(int n, int m, int[] section) {
		int answer = 0;
		int index = 0;

		for (int i : section) {
			if (i > index) {
				answer++;
				index = i + m - 1;
			}
		}
		return answer;
	}

}
