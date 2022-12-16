package level0;

public class Solution_120820 {

	public static void main(String[] args) {
		System.out.println(solution(40));
		System.out.println(solution(23));
	}
	
    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }

}
