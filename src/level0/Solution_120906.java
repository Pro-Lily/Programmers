package level0;

public class Solution_120906 {

	public static void main(String[] args) {
		System.out.println(solution(1234));
		System.out.println(solution(930211));
	}

	public static int solution(int n) {
		int answer = 0;
		String[] str = String.valueOf(n).split("");
		for (String s : str) {
			answer += Integer.parseInt(s);
		}
		return answer;
	}

}
