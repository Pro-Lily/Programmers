package level1;

import java.time.LocalDate;

public class Solution_12901 {

	public static void main(String[] args) {
		System.out.println(solution(5, 24));
	}

	public static String solution(int a, int b) {
		return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
	}

}
