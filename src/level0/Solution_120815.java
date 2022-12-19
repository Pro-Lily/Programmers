package level0;

public class Solution_120815 {

	public static void main(String[] args) {
		System.out.println(solution(6));
		System.out.println(solution(10));
		System.out.println(solution(4));
	}

	public static int solution(int n) {
		int answer = getGCD(n, 6);
		int result = n / answer;
		return result;
	}

	public static int getGCD(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCD(num2, num1 % num2);
	}

}
