package exam;

import java.util.Scanner;

public class MineGamePlay extends MapUI {
	private char[][] userMap;
	private boolean clearCheck = true;
	private boolean gameRun = true;

	MineGamePlay(int m, int n, double p) {
		super(m, n, p);
		this.userMap = getUserMap();
	}

	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		int x, y;
		while (gameRun) {
			drawMap(gameMap);
			System.out.println("\n상자의 좌표를 입력해주세요.");
			x = sc.nextInt();
			y = sc.nextInt();
			gameRun = positionCheck(--x, --y);
			gameRun = clearCheck();
		}
		drawMap(gameMap);
		gameEnd();
	}

	private void gameEnd() {
		if (clearCheck)
			System.out.println("축하드립니다. 클리어 하셨습니다.");
		else
			System.out.println("지뢰를 밟으셨습니다.");
	}

	private boolean positionCheck(int x, int y) {
		if (userMap[y][x] == '*') {
			clearCheck = false;
			addAllMine();
			return false;
		} else if (userMap[y][x] == '0') {
			addConnectedZero(x, y);
		} else {
			gameMap[y][x] = userMap[y][x];
		}
		return true;
	}

	private boolean clearCheck() {
		if (!gameRun)
			return false;
		for (int y = 0; y < userMap.length; y++) {
			for (int x = 0; x < userMap[0].length; x++) {
				if (userMap[y][x] != gameMap[y][x] && userMap[y][x] != '*')
					return true;
			}
		}
		return false;
	}

	private void addAllMine() {
		for (int y = 0; y < userMap.length; y++) {
			for (int x = 0; x < userMap[0].length; x++) {
				if (userMap[y][x] == '*')
					gameMap[y][x] = '*';
			}
		}
	}

	private void addConnectedZero(int x, int y) {
		gameMap[y][x] = userMap[y][x];
		for (int i = 0; i < square.length; i++) {
			if (x + square[i][0] < 0 || y + square[i][1] < 0 || x + square[i][0] >= userMap[0].length
					|| y + square[i][1] >= userMap.length) {
				continue;
			} else {
				if (userMap[y + square[i][1]][x + square[i][0]] == '0'
						&& gameMap[y + square[i][1]][x + square[i][0]] != userMap[y + square[i][1]][x + square[i][0]])
					addConnectedZero(x + square[i][0], y + square[i][1]);
				else
					gameMap[y + square[i][1]][x + square[i][0]] = userMap[y + square[i][1]][x + square[i][0]];
			}
		}
		return;
	}

}
