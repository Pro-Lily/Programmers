package level1;

public class Solution_131128 {

	public static void main(String[] args) {
		System.out.println(solution("100", "2345"));
		System.out.println(solution("100", "203045"));
		System.out.println(solution("100", "123450"));
		System.out.println(solution("12321", "42531"));
		System.out.println(solution("5525", "1255"));
	}

	public static String solution(String X, String Y) {
		int[] xArr = new int[10];
		int[] yArr = new int[10];

		StringBuilder sb = new StringBuilder();

		for (String str : X.split("")) {
			xArr[Integer.parseInt(str)]++;
		}

		for (String str : Y.split("")) {
			yArr[Integer.parseInt(str)]++;
		}

		for (int i = 9; i >= 0; i--) {
			while (xArr[i] > 0 && yArr[i] > 0) {
				sb.append(i);
				xArr[i]--;
				yArr[i]--;
			}
		}

		if ("".equals(sb.toString())) {
			return "-1";
		} else if ("0".equals(sb.toString().substring(0, 1))) {
			return "0";
		} else {
			return sb.toString();
		}
	}

}
