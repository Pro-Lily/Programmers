package level1;

public class Solution_159994 {

	public static void main(String[] args) {
		String[] cards1 = { "i", "drink", "water" };
		String[] cards2 = { "want", "to" };
		String[] goal1 = { "i", "want", "to", "drink", "water" };

		// System.out.println(solution(cards1, cards2, goal1));

		String[] cards3 = { "i", "water", "drink" };
		String[] cards4 = { "want", "to" };
		String[] goal2 = { "i", "want", "to", "drink", "water" };

		System.out.println(solution(cards3, cards4, goal2));
	}

	public static String solution(String[] cards1, String[] cards2, String[] goal) {
		int j = 0, k = 0;

		for (int i = 0; i < goal.length; i++) {
			if (j < cards1.length && goal[i].equals(cards1[j])) {
				goal[i] = "";
				j++;
			} else if (k < cards2.length && goal[i].equals(cards2[k])) {
				goal[i] = "";
				k++;
			} else {
				return "No";
			}
		}

		return "Yes";
	}

}
