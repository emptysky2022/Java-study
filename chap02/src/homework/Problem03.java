package homework;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = in.nextInt();
			if (num % 2 == 0) // 값이 짝수면 덧셈하기
				sum += num;
		} while (num >= 0); // 양의 정수가 아닐때까지

		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}
}
