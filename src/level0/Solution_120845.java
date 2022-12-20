package level0;

public class Solution_120845 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1 };
		System.out.println(solution(arr1, 1));

		int[] arr2 = { 10, 8, 6 };
		System.out.println(solution(arr2, 3));
	}

	public static int solution(int[] box, int n) {
		return (box[0] / n) * (box[1] / n) * (box[2] / n);
	}

}
