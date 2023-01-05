package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_120852 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12)));
		System.out.println(Arrays.toString(solution(17)));
		System.out.println(Arrays.toString(solution(420)));
	}

	public static int[] solution(int n) {
		List<Integer> list = new ArrayList<>();
		int i = 2;

		while (n >= 2) {
			if (n % i == 0) {
				list.add(i);
				n /= i;
			} else {
				i++;
			}
		}

		return list.stream().distinct().mapToInt(Integer::intValue).toArray();
	}

}
