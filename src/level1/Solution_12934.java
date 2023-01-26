package level1;

public class Solution_12934 {

	public static void main(String[] args) {
		System.out.println(solution(121));
		System.out.println(solution(3));
	}

	public static long solution(long n) {
		long answer = 0;
		Double x = Math.sqrt(n);

		if (x == x.intValue()) {
			answer = (long) Math.pow(x + 1, 2);
		} else {
			answer = -1;
		}

		return answer;
	}

}
