package exam;

import java.util.Scanner;

public class FindLandMine {
	public static void main(String[] args) {
		int m, n;
		double p;
		Scanner in = new Scanner(System.in);

		m = in.nextInt();
		n = in.nextInt();
		p = in.nextDouble();

		MapUI mUI = new MapUI(m, n, p);
		mUI.drawMap();
		System.out.print("\n");
		mUI.drawUserMap();
	}

}
