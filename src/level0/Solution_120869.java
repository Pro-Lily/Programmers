package level0;

public class Solution_120869 {

	public static void main(String[] args) {
		String[] str1 = { "p", "o", "s" };
		String[] str2 = { "sod", "eocd", "qixm", "adio", "soo" };
		
		System.out.println(solution(str1, str2));

		String[] str3 = { "z", "d", "x" };
		String[] str4 = { "def", "dww", "dzx", "loveaw" };
		
		System.out.println(solution(str3, str4));

		String[] str5 = { "s", "o", "m", "d" };
		String[] str6 = { "moos", "dzx", "smm", "sunmmo", "som" };
		
		System.out.println(solution(str5, str6));
	}

	public static int solution(String[] spell, String[] dic) {
		int answer = 2;
		int count = 0;

		for (int i = 0; i < dic.length; i++) {
			count = 0;
			if (dic[i].length() == spell.length) {
				for (int j = 0; j < spell.length; j++) {
					if (dic[i].contains(spell[j])) {
						count++;
					} else {
						break;
					}
				}
				if (count == dic[i].length()) {
					answer = 1;
				}
			}
		}
		return answer;
	}

}
