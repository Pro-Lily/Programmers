package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_12981 {

	public static void main(String[] args) {
		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		System.out.println(Arrays.toString(solution(3, words)));
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = new int[2];

		List<String> list = new ArrayList<>();

		String frist = "";
		String last = "";

		for (int i = 0; i < words.length; i++) {
			if (i > 0) {
				frist = words[i].substring(0, 1);
				last = words[i - 1].substring(words[i - 1].length() - 1);

				if (frist.equals(last)) {
					if (list.contains(words[i])) {
						answer[0] = (i % n) + 1;
						answer[1] = (i / n) + 1;
						break;
					}
					list.add(words[i]);
				} else {
					answer[0] = (i % n) + 1;
					answer[1] = (i / n) + 1;
					break;
				}
			} else {
				list.add(words[i]);
			}
		}

		return answer;
	}

}