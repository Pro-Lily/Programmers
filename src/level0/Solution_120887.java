package level0;

public class Solution_120887 {

	public static void main(String[] args) {
		System.out.println(solution(1, 13, 1));
	}

	public static int solution(int i, int j, int k) {
		String str = "";

		for (int n = i; n <= j; n++) {
			str += String.valueOf(n);
		}
		
		String total = str.replaceAll(String.valueOf(k), "");
		
		return str.length() - total.length();
	}

}
