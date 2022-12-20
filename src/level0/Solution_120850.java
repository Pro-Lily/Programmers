package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_120850 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("hi12392")));
		System.out.println(Arrays.toString(solution("p2o4i8gj2")));
		System.out.println(Arrays.toString(solution("abcde0")));
	}

	public static int[] solution(String my_string) {
		List<Integer> answer = new ArrayList<>();
		String[] my_stringArray = my_string.split("");
		int check = 0;

		for (int i = 0; i < my_stringArray.length; i++) {
			check = my_stringArray[i].charAt(0) - '0';
			if (check < 10) {
				answer.add(check);
			}
		}

		Collections.sort(answer);

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

}
