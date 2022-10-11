package practice;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int input;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		input = in.nextInt();

		System.out.println(input % 2 == 0 ? "짝수" : "홀수");
	}
}
