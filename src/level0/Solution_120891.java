package level0;

public class Solution_120891 {

	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(29423));
	}

	public static int solution(int order) {
		int answer = 0;
		String[] number = String.valueOf(order).split("");

		for (int i = 0; i < number.length; i++) {
			if (number[i].equals("3") || number[i].equals("6") || number[i].equals("9")) {
				answer++;
			}
		}

		return answer;
	}

}
