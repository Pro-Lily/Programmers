package level1;

public class Solution_12930 {

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

	public static String solution(String s) {
		String answer = "";
		String[] sArr = s.split("");

		int index = 0;

		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals(" ")) {
				index = 0;
			} else if (index % 2 == 0) {
				sArr[i] = sArr[i].toUpperCase();
				index++;
			} else {
				sArr[i] = sArr[i].toLowerCase();
				index++;
			}
			answer += sArr[i];
		}

		return answer;
	}

}
