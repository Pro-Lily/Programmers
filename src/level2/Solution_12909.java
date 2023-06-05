package level2;

import java.util.Stack;

public class Solution_12909 {

	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

	static boolean solution(String s) {
		boolean answer = true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}

		if (!stack.isEmpty()) {
			return false;
		}
		return answer;
	}

}
