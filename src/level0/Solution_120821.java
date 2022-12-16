package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_120821 {

	public static void main(String[] args) {
		int[] number1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(solution(number1)));

		int[] number2 = { 1, 1, 1, 1, 1, 2 };
		System.out.println(Arrays.toString(solution(number2)));

		int[] number3 = { 1, 0, 1, 1, 1, 3, 5 };
		System.out.println(Arrays.toString(solution(number3)));
	}

	public static int[] solution(int[] num_list) {
		Integer b[] = Arrays.stream(num_list).boxed().toArray(Integer[]::new);

		List<Integer> list = Arrays.asList(b);
		Collections.reverse(list);

		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}

}
