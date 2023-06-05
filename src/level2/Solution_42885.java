package level2;

import java.util.Arrays;

public class Solution_42885 {

	public static void main(String[] args) {
		int[] people1 = { 70, 50, 80, 50 };
		System.out.println(solution(people1, 100));

		int[] people2 = { 70, 80, 50 };
		System.out.println(solution(people2, 100));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int index = 0;
		for (int i = people.length - 1; i >= index; i--) {
			if (people[i] + people[index] <= limit) {
				answer++;
				index++;
			} else {
				answer++;
			}
		}

		return answer;
	}

}