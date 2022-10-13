package exam;

public class MapUI {
	private char[][] mineMap;
	private char[][] userMap;
	private int[][] square = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, -1 }, { 0, 1 } };

	MapUI(int m, int n, double p) {
		mineMap = new char[m][n];
		userMap = new char[m][n];
		makeMap(p);
		makeUserMap();
	}

	private void makeMap(double p) {
		for (int y = 0; y < mineMap.length; y++) {
			for (int x = 0; x < mineMap[0].length; x++) {
				if (Math.random() < p)
					mineMap[y][x] = '*';
				else
					mineMap[y][x] = '-';
			}
		}
	}

	private void makeUserMap() {
		for (int y = 0; y < userMap.length; y++) {
			for (int x = 0; x < userMap[0].length; x++) {
				if (mineMap[y][x] == '*') {
					userMap[y][x] = '*';
					continue;
				}
				userMap[y][x] = squareCheck(x, y);
			}
		}
	}

	private char squareCheck(int x, int y) {
		int mineCount = 0;
		for (int i = 0; i < square.length; i++) {
			if (x + square[i][0] < 0 || y + square[i][1] < 0

					|| x + square[i][0] >= mineMap[0].length || y + square[i][1] >= mineMap.length)
				continue;
			else {
				if (mineMap[y + square[i][1]][x + square[i][0]] == '*')
					mineCount++;
			}
		}

		return (char) (mineCount + '0');
	}

	public void drawMap() {
		for (int y = 0; y < mineMap.length; y++) {
			for (int x = 0; x < mineMap[0].length; x++) {
				System.out.print(mineMap[y][x] + " ");
			}
			System.out.print("\n");
		}

	}

	public void drawUserMap() {
		for (int y = 0; y < userMap.length; y++) {
			for (int x = 0; x < userMap[0].length; x++) {
				System.out.print(userMap[y][x] + " ");
			}
			System.out.print("\n");
		}

	}
}
