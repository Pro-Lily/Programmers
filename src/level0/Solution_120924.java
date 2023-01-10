package level0;

public class Solution_120924 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		System.out.println(solution(arr1));

		int[] arr2 = { 2, 4, 8 };
		System.out.println(solution(arr2));
	}

	public static int solution(int[] common) {
		int answer = 0;

		if (common[1] - common[0] == common[2] - common[1]) {
			answer = common[common.length - 1] + common[1] - common[0];
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}

		return answer;
	}

}
