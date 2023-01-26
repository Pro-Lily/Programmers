package level1;

public class Solution_12947 {

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}

	public static boolean solution(int x) {
		boolean answer = true;
		String[] strArr = String.valueOf(x).split("");
		int num = 0;

		for (int i = 0; i < strArr.length; i++) {
			num += Integer.parseInt(strArr[i]);
		}

		if (x % num != 0) {
			answer = false;
		}

		return answer;
	}

}
