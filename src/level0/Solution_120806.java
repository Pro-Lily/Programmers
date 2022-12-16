package level0;

public class Solution_120806 {

	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(7, 3));
		System.out.println(solution(1, 16));
	}

	public static int solution(int num1, int num2) {
		float answer = (((float) num1 / num2) * 1000);
		return (int) answer;
	}

}
