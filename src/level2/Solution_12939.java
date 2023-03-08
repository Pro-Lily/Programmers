package level2;

import java.util.Arrays;

public class Solution_12939 {

	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
	}

	public static String solution(String s) {
		String answer = "";
		String[] strArr = s.split(" ");

		int[] nums = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(nums);

		answer = String.valueOf(nums[0]) + " " + String.valueOf(nums[nums.length - 1]);

		return answer;
	}

}
