package level0;

public class Solution_120885 {

	public static void main(String[] args) {
		System.out.println(solution("10", "11"));
		System.out.println(solution("1001", "1111"));
	}

	public static String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}

}
