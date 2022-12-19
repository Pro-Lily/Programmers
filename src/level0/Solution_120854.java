package level0;

import java.util.Arrays;

public class Solution_120854 {

	public static void main(String[] args) {
		String[] str1 = {"We", "are", "the", "world!"};
		System.out.println(Arrays.toString(solution(str1)));
		
		String[] str2 = {"I", "Love", "Programmers."};
		System.out.println(Arrays.toString(solution(str2)));
	}

	public static int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		return answer;
	}

}
