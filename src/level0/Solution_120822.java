package level0;

public class Solution_120822 {

	public static void main(String[] args) {
		System.out.println(solution("jaron"));
		System.out.println(solution("bread"));
	}

	public static String solution(String my_string) {
		return new StringBuilder(my_string).reverse().toString();
	}

}
