package homework;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		System.out.print("양의 정수를 입력해주세요 : ");
		int n = new Scanner(System.in).nextInt();
		if (n < 0)
			System.out.println("양의 정수가 아닙니다.");
		else
			System.out.println(n + "! = " + factorial(n));
	}

	static int factorial(int n) {
		return switch (n) {
		case 0, 1 -> 1;
		default -> n * factorial(n - 1);
		};
	}
}
