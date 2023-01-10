package level0;

public class Solution_120866 {

	public static void main(String[] args) {
		int[][] arr1 = {{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 1, 0, 0 },
						{ 0, 0, 0, 0, 0 }};
		System.out.println(solution(arr1));

		int[][] arr2 = {{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0, 0 }, 
						{ 0, 0, 1, 1, 0 },
						{ 0, 0, 0, 0, 0 }};
		System.out.println(solution(arr2));

		int[][] arr3 = {{ 1, 1, 1, 1, 1, 1 }, 
						{ 1, 1, 1, 1, 1, 1 }, 
						{ 1, 1, 1, 1, 1, 1 }, 
						{ 1, 1, 1, 1, 1, 1 },
						{ 1, 1, 1, 1, 1, 1 }, 
						{ 1, 1, 1, 1, 1, 1 }};
		System.out.println(solution(arr3));
	}

	public static int solution(int[][] board) {
		int answer = 0;
		int n = board.length;
		int[][] copyBoard = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) {
					boardCheck(i, j, n, copyBoard);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (copyBoard[i][j] == 0) {
					answer++;
				}
			}
		}

		return answer;
	}

	public static void boardCheck(int i, int j, int size, int[][] copyBoard) {
		int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

		copyBoard[i][j] = 1;

		for (int k = 0; k < 8; k++) {
			int x = i + dx[k];
			int y = j + dy[k];

			if (x < 0 || x >= size || y < 0 || y >= size) {
				continue;
			}
			copyBoard[x][y]++;
		}
	}

}
