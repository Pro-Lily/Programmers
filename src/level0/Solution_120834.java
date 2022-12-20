package level0;

public class Solution_120834 {

	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(51));
	}
	
	public static String solution(int age) {
        String answer = "";
        String[] ageArray = String.valueOf(age).split("");
        
        for(int i=0; i<ageArray.length; i++){
            answer += (char) (Integer.parseInt(ageArray[i]) + 97);
        }
        return answer;
    }

}
