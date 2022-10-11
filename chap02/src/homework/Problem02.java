package homework;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		int rank;
		Scanner in = new Scanner(System.in);

		System.out.print("등수 입력 : ");
		rank = in.nextInt();

		switch (rank) {
		case 1 -> System.out.println("아주 잘했습니다.");
		case 2, 3 -> System.out.println("잘했습니다.");
		case 4, 5, 6 -> System.out.println("보통입니다.");
		default -> System.out.println("노력해야겠습니다.");
		}
	}
}
