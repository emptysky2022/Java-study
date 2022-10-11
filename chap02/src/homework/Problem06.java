package homework;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		String userA, userB;
		Scanner in = new Scanner(System.in);

		System.out.print("철수 : ");
		userA = in.next();
		System.out.print("영희 : ");
		userB = in.next();

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
