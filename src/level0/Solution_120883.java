package level0;

import java.util.HashMap;

public class Solution_120883 {

	public static void main(String[] args) {
		String[] str1 = { "meosseugi", "1234" };
		String[][] str2 = { { "rardss", "123" }, { "yyoom", "1234" }, { "meosseugi", "1234" } };

		System.out.println(solution(str1, str2));

		String[] str3 = { "programmer01", "15789" };
		String[][] str4 = { { "programmer02", "111111" }, { "programmer00", "134" }, { "programmer01", "1145" } };

		System.out.println(solution(str3, str4));

		String[] str5 = { "rabbit04", "98761" };
		String[][] str6 = { { "jaja11", "98761" }, { "krong0313", "29440" }, { "rabbit00", "111333" } };

		System.out.println(solution(str5, str6));
	}

	public static String solution(String[] id_pw, String[][] db) {
		HashMap<String, String> loginMap = new HashMap<>();

		for (String[] str : db) {
			loginMap.put(str[0], str[1]);
		}

		if (loginMap.containsKey(id_pw[0])) {
			if (loginMap.get(id_pw[0]).equals(id_pw[1])) {
				return "login";
			} else {
				return "wrong pw";
			}
		} else {
			return "fail";
		}
	}

}
