package level0;

public class Solution_120902 {

	public static void main(String[] args) {
		System.out.println(solution("3 + 4"));
	}

    public static int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        
        for(int i=0; i<str.length; i++){
            if(i%2 != 0){
                if(str[i].equals("+")){
                    answer += Integer.parseInt(str[i+1]);
                }else if(str[i].equals("-")) {
                    answer -= Integer.parseInt(str[i+1]);
                }
               
            }
        }
        return answer;
    }
	
}
