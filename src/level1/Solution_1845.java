package level1;

import java.util.HashSet;
import java.util.Set;

public class Solution_1845 {

	public static void main(String[] args) {
		int[] nums1 = { 3, 1, 2, 3 };
		System.out.println(solution(nums1));

		int[] nums2 = { 3, 3, 3, 2, 2, 4 };
		System.out.println(solution(nums2));

		int[] nums3 = { 3, 3, 3, 2, 2, 2 };
		System.out.println(solution(nums3));
	}

	public static int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();

		for (int i : nums) {
			set.add(i);
		}

		return nums.length / 2 < set.size() ? nums.length / 2 : set.size();
	}

}
