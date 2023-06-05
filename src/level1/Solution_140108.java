package level1;

public class Solution_140108 {

	public static void main(String[] args) {
		String s = "banana";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int same = 0, notSame = 0;
		int answer = 0;
		char x = s.charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (x == 0) {
				x = s.charAt(i);
			}

			if (x == s.charAt(i)) {
				same++;
			} else {
				notSame++;
			}

			if (same == notSame) {
				x = 0;
				same = 0;
				notSame = 0;
				answer++;
			}
		}

		if (x != 0) {
			answer++;
		}
		
		return answer;
	}

}
