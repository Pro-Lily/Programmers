package level0;

public class Solution_120814 {

	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(1));
		System.out.println(solution(15));
	}

	public static int solution(int n) {
		int answer = 0;
		
		if (n % 7 == 0) {
			return n / 7;
		} else if (n % 7 != 0) {
			return (n / 7) + 1;
		}
		
		return answer;
	}

}
