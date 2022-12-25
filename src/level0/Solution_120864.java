package level0;

public class Solution_120864 {

	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123Z"));
	}

	public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("[a-zA-Z]");
        for(int i=0; i<str.length; i++){
            if(! str[i].isEmpty()){
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
	
}
