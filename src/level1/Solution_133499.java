package level1;

public class Solution_133499 {

	public static void main(String[] args) {
		String[] babbling1 = { "aya", "yee", "u", "maa" };
		System.out.println(solution(babbling1));

		String[] babbling2 = { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa" };
		System.out.println(solution(babbling2));
	}

	public static int solution(String[] babbling) {
		int answer = 0;
		String[] word = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			int index = 0;

			for (String str : word) {
				babbling[i] = babbling[i].replace(str, String.valueOf(index));
				index++;
			}

			int tmp = -1;
			int count = 0;

			for (int k = 0; k < babbling[i].length(); k++) {
				int asc = babbling[i].charAt(k) - 0;

				if (asc >= 48 && asc < 53 && tmp != asc) {
					tmp = asc;
					count++;
				} else {
					count = 0;
					break;
				}
			}

			if (count > 0) {
				answer++;
			}

		}

		return answer;
	}

}
