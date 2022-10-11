package practice;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		double input;
		Scanner in = new Scanner(System.in);

		System.out.print("화씨온도(Ｆ) 입력 : ");
		input = in.nextDouble();

		System.out.println("섭씨 온도는 " + (input - 32) / 9 * 5 + "℃입니다.");
	}
}
