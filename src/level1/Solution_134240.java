package level1;

public class Solution_134240 {

	public static void main(String[] args) {
		int[] food1 = { 1, 3, 4, 6 };
		System.out.println(solution(food1));

		int[] food2 = { 1, 7, 1, 2 };
		System.out.println(solution(food2));
	}

	public static String solution(int[] food) {
		String answer = "0";
		for (int i = food.length - 1; i >= 1; i--) {
			int k = food[i] / 2;
			for (int j = 0; j < k; j++) {
				answer = i + answer;
				answer = answer + i;
			}
		}

		return answer;
	}

}
