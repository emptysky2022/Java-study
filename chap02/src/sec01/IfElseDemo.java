package sec01;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		int input;
		Scanner in = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		input = in.nextInt();

		if (input % 2 == 0)
			System.out.println("짝수!");
		else
			System.out.println("홀수!");
		System.out.println("종료");

	}
}
