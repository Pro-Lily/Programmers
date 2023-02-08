package level1;

public class Solution_77484 {

	public static void main(String[] args) {
		int[] lottos1 = { 44, 1, 0, 0, 31, 25 };
	}

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int max_cnt = 0;
		int min_cnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				max_cnt++;
			} else {
				for (int j = 0; j < win_nums.length; j++) {
					if (lottos[i] == win_nums[j]) {
						max_cnt++;
						min_cnt++;
					}
				}
			}
		}

		answer[0] = score(max_cnt);
		answer[1] = score(min_cnt);

		return answer;
	}

	public int score(int count) {
		switch (count) {
			case 6:
				return 1;
			case 5:
				return 2;
			case 4:
				return 3;
			case 3:
				return 4;
			case 2:
				return 5;
		}
		return 6;
	}

}
