package level1;

public class Solution_12931 {

	public static void main(String[] args) {
		System.out.println(solution(123));
		System.out.println(solution(987));
	}

	public static int solution(int n) {
		int answer = 0;
		String[] strArr = String.valueOf(n).split("");

		for (String str : strArr) {
			answer += Integer.parseInt(str);
		}

		return answer;
	}

}
