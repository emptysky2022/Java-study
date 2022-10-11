package sec04;

import java.util.Scanner;

public class ArithmeticDemo {
	public static void main(String[] args) {
		double remainder = 25 % 2;
		System.out.println("25 ÷ 2의 나머지는 " + (int) remainder + "입니다.");

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		remainder = x % 2;

		System.out.println((remainder == 0) ? x + "는 짝수입니다." : x + "는 홀수입니다.");

		int num1 = 7;
		int num2 = 3;
		remainder = (double) num1 / (double) num2;
		System.out.println("num1 / num2 = " + remainder);

	}
}
