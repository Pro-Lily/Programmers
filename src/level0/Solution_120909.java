package level0;

public class Solution_120909 {

	public static void main(String[] args) {
		System.out.println(solution(144));
		System.out.println(solution(976));
	}

	public static int solution(int n) {
		int answer = (int) Math.sqrt(n) * (int) Math.sqrt(n);
		return answer == n ? 1 : 2;
	}

}
