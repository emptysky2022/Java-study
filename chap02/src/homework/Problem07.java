package homework;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c, y);

	}

	public static String input(String str) {
		Scanner in = new Scanner(System.in);
		String returnValue;
		System.out.print(str + " : ");
		returnValue = in.next();
		return returnValue;
	}

	public static void whosWin(String userA, String userB) {
		switch (userA) {
		case "r":
			switch (userB) {
			case "r" -> System.out.println("무승부!");
			case "s" -> System.out.println("철수 승!");
			case "p" -> System.out.println("영희 승!");
			default -> System.out.println("잘못된 입력입니다.");
			}
			break;
		case "s":
			switch (userB) {
			case "r" -> System.out.println("영희 승!");
			case "s" -> System.out.println("무승부!");
			case "p" -> System.out.println("철수 승!");
			default -> System.out.println("잘못된 입력입니다.");
			}
			break;
		case "p":
			switch (userB) {
			case "r" -> System.out.println("철수 승!");
			case "s" -> System.out.println("영희!");
			case "p" -> System.out.println("무승부!");
			default -> System.out.println("잘못된 입력입니다.");
			}
			break;
		default:
			System.out.println("잘못된 입력입니다.");

		}
	}

}
