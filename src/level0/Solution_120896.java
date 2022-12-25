package level0;

public class Solution_120896 {

	public static void main(String[] args) {
		System.out.println(solution("abcabcadc"));
		System.out.println(solution("abdc"));
		System.out.println(solution("hello"));
	}

	public static String solution(String s) {
		String answer = "";
		String[] sArr = s.split("");
		int[] alph = new int[26];

		for (int i = 0; i < sArr.length; i++) {
			alph[sArr[i].charAt(0) - 97]++;
		}

		for (int i = 0; i < alph.length; i++) {
			if (alph[i] == 1) {
				answer += (char) (i + 97);
			}
		}

		return answer;
	}

}
