package level0;

public class Solution_120921 {

	public static void main(String[] args) {
		System.out.println(solution("hello", "ohell"));
		System.out.println(solution("apple", "elppa"));
	}

	public static int solution(String A, String B) {
		String str = B.repeat(2);
		return str.indexOf(A);
	}
}
