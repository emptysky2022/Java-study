package practice;

import java.util.Scanner;

public class Squared {
	public static void main(String[] args) {
		int input;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		input = in.nextInt();

		System.out.println(input + "의 제곱은 " + input * input);
	}
}
