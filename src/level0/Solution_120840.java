package level0;

import java.math.BigInteger;

public class Solution_120840 {

	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(5, 3));
	}

	public static BigInteger solution(int balls, int share) {
		BigInteger[] DP = new BigInteger[31];
		DP[0] = new BigInteger("1");
		DP[1] = new BigInteger("1");

		for (int i = 2; i <= 30; i++) {
			DP[i] = DP[i - 1].multiply(new BigInteger(Integer.toString(i)));
		}

		return (DP[balls].divide(DP[balls - share].multiply(DP[share])));

	}

}
