package sec01;

import java.util.Scanner;

public class SimpleIfDemo {
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("짝수!");
		if (number % 2 == 1)
			System.out.println("홀수!");
		System.out.println("종료");
	}
}
