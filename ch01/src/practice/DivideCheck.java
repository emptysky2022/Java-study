package practice;

import java.util.Scanner;

public class DivideCheck {
	public static void main(String[] args) {
		int x;
		Scanner in = new Scanner(System.in);

		System.out.print("정수 x 입력 : ");
		x = in.nextInt();

		System.out.println(x % 4 == 0 && x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 || x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 ^ x % 5 == 0 ? "true" : "false");
		System.out.println((x % 4 == 0 || x % 5 == 0) && !(x % 4 == 0 && x % 5 == 0) ? "true" : "false");

	}
}
