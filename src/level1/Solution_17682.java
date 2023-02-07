package level1;

public class Solution_17682 {

	public static void main(String[] args) {
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
	}

	public static int solution(String dartResult) {
		int answer = 0;
		String[] str = dartResult.split("");
		int[] score = new int[3];

		int index = 0;

		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("[0-9]")) {
				if (str[i + 1].matches("[0-9]")) {
					score[index] = 10;
					i++;
				} else {
					score[index] = Integer.parseInt(str[i]);
				}
			} else if (str[i].matches("[A-Z]")) {
				int tmp = score[index];
				score[index] = pow(tmp, str[i]);
				index++;
			} else {
				if (str[i].equals("*")) {
					score[index - 1] *= 2;
					if (index > 1) {
						score[index - 2] *= 2;
					}
				} else if (str[i].equals("#")) {
					score[index - 1] *= -1;
				}
			}
		}

		for (int i : score) {
			answer += i;
		}

		return answer;
	}

	public static int pow(int tmp, String type) {
		switch (type) {
		case "S":
			tmp = (int) Math.pow(tmp, 1);
			break;
		case "D":
			tmp = (int) Math.pow(tmp, 2);
			break;
		case "T":
			tmp = (int) Math.pow(tmp, 3);
		}
		return tmp;
	}

}
