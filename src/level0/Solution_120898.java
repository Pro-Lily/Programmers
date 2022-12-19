package level0;

import java.util.Arrays;
import java.util.List;

public class Solution_120898 {

	public static void main(String[] args) {
		System.out.println(solution("happy birthday!"));
		System.out.println(solution("I love you~"));
	}

	public static int solution(String message) {
		List<String> list = Arrays.asList(message.split(""));
		return list.size() * 2;
	}

}
