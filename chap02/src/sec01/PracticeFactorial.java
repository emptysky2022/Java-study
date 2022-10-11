package sec01;

import java.util.Scanner;

public class PracticeFactorial {
	public static void main(String[] args) {
		int result, n, tmp;
		Scanner in = new Scanner(System.in);

		System.out.print("팩토리얼 정수값 입력 : ");
		n = in.nextInt();
		// 1번 : while문 사용
		result = 1;
		tmp = n;
		while (tmp > 0) {
			result *= tmp--;
		}

		System.out.println("1번 : " + result);

		// 2번 : while문 안에 조건문 사용
		result = 1;
		tmp = n;
		while (true) {
			if (tmp <= 0)
				break;
			result *= tmp--;
		}

		System.out.println("2번 : " + result);

		// 3번 : 메서드를 사용
		result = factorial(n);
		System.out.println("3번 : " + result);

		// 4번 : 메서드 오버로딩
		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int x) {
		int r = 1;
		if (x == 0 || x == 1)
			return 1;
		r = x * factorial(x - 1);
		return r;
	}

	public static int factorial(int x, int y) {
		int r = 1;
		while (y >= x) {
			r *= y--;
		}
		return r;
	}
}
