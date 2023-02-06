package level1;

public class Solution_12977 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println(solution(nums1));

		int[] nums2 = { 1, 2, 7, 6, 4 };
		System.out.println(solution(nums2));
	}

	public static int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					
					if (sosu(sum)) {
						answer++;
					}
				}
			}
		}

		return answer;
	}

	public static boolean sosu(int num) {
		boolean check = true;
		
		if (num == 2) { 
			return true;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = false;
				break;
			}
		}
		
		return check;
	}

}
