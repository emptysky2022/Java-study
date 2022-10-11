package practice;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		int input;
		Scanner in = new Scanner(System.in);

		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		input = in.nextInt();

		System.out.println("각 자릿수의 합 = " + (input / 100 + input % 100 / 10 + input % 10));
	}
}
