package level0;

public class Solution_120837 {

	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(24));
		System.out.println(solution(999));
	}
	
    public static int solution(int hp) {
        int answer = 0;
       
        while(hp > 0){
            if(hp >= 5){
                hp -= 5;
                answer++;
            }else if(hp >= 3){
                hp -= 3;
                answer++;
            }else {
                hp -= 1;
                answer++;
            }
        }
        
        return answer;
    }

}
