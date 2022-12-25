package level0;

public class Solution_120894 {

	public static void main(String[] args) {
		System.out.println(solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(solution("onefourzerosixseven"));
	}

	public static long solution(String numbers) {
		String[] numbersArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < numbersArr.length; i++) {
			numbers = numbers.replaceAll(numbersArr[i], String.valueOf(i));
		}

		long answer = Long.parseLong(numbers);
		return answer;
	}

}
