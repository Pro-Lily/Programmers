package level0;

import java.util.HashMap;

public class Solution_120838 {

	public static void main(String[] args) {
		System.out.println(solution(".... . .-.. .-.. ---"));
		System.out.println(solution(".--. -.-- - .... --- -."));
	}
	
    public static String solution(String letter) {
        String answer = "";
        
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String[] word = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z"
        };
        
        HashMap<String, String> map = new HashMap<>();
        
        for(int i=0; i<word.length; i++){
            map.put(morse[i], word[i]);
        }
        
        String[] letterArr = letter.split(" ");
        
        for(String str : letterArr){
            answer += map.get(str);
        }
        
        return answer;
    }

}
