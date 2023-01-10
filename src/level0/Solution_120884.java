package level0;

public class Solution_120884 {

	public static void main(String[] args) {
		System.out.println(solution(100));
		System.out.println(solution(1081));
	}

	public static int solution(int chicken) {
		int answer = 0;

		while (chicken >= 10) {
			int newChicken = chicken / 10;
			int coupon = chicken % 10;
			chicken = newChicken + coupon;

			answer += newChicken;
		}

		return answer;
	}

}
