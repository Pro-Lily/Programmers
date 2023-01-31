package level1;

public class Solution_68935 {

	public static void main(String[] args) {
		System.out.println(solution(45));
		System.out.println(solution(125));
	}

	public static int solution(int n) {
		String str = "";

		while (n != 0) {
			str += n % 3;
			n /= 3;
		}

		return Integer.parseInt(str, 3);
	}

}
