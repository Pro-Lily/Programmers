package level1;

import java.util.Arrays;

public class Solution_12917 {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
	
    public static String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        
        Arrays.sort(sArr);
        
        for(int i=sArr.length-1; i>=0; i--){
            answer += sArr[i];
        }
        
        return answer;
    }

}
