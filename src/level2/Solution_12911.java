package level2;

public class Solution_12911 {

	public static void main(String[] args) {
		System.out.println(solution(78));
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int n1 = Integer.bitCount(n);

		while (true) {
			n++;
			int n2 = Integer.bitCount(n);

			if (n1 == n2) {
				break;
			}
		}

		return n;
	}

}