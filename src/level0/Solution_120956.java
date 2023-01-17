package level0;

public class Solution_120956 {

	public static void main(String[] args) {
		String[] arr1 = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(solution(arr1));
		
		String[] arr2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		System.out.println(solution(arr2));
	}

	public static int solution(String[] babbling) {
        int answer = 0;
        String[] speaking = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(String str : speaking){
                babbling[i] = babbling[i].replace(str, " ");
            }
            String str = babbling[i].trim();
            if(str.length() == 0){
                answer++;
            }
        }
        return answer;
    }
	
}
