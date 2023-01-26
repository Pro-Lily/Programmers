package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_12932 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

	public static int[] solution(long n) {
		String[] strArr = String.valueOf(n).split("");
		int[] answer = new int[strArr.length];
		
		List<String> list = Arrays.asList(strArr);
		
		Collections.reverse(list);

		for (int i = 0; i < list.size(); i++) {
			answer[i] = Integer.parseInt(list.get(i));
		}

		return answer;
	}

}
