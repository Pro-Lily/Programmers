package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_135808 {

	public static void main(String[] args) {
		int[] score1 = { 1, 2, 3, 1, 2, 3, 1 };
		System.out.println(solution(3, 4, score1));
	}

    public static int solution(int k, int m, int[] score) {
        int answer = 0;
		List<Integer> list = Arrays.stream(score).boxed().collect(Collectors.toList());
		
        Collections.sort(list, Collections.reverseOrder());

        int index = 0;
                
		for(int i=0; i<list.size()/m; i++){
            int min = 10;
            for(int j=index; j<index+m; j++){
                if(list.get(j) < min){
                    min = list.get(j);
                }
            }   
            index += m;
            answer += min * m;
        }

		return answer;
    }

}
