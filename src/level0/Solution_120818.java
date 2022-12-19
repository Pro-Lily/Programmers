package level0;

public class Solution_120818 {

	public static void main(String[] args) {
		System.out.println(solution(150000));
		System.out.println(solution(580000));
	}

	public static int solution(int price) {
		int answer = 0;
		double money = 0;

		if (price < 100000) {
			money = price;
		} else if (price < 300000) {
			money = price * 0.95;
		} else if (price < 500000) {
			money = price * 0.9;
		} else if (price >= 500000) {
			money = price * 0.8;
		}

		answer = (int) money;

		return answer;
	}

}
