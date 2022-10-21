package sec03;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A, Z;
		while (true) {
			System.out.print("정수 A와 Z를 입력해주세요 : ");
			A = in.nextInt();
			Z = in.nextInt();
			if (Math.abs(Z - A) + 1 < 10)
				System.out.println("정수 두개 사이의 숫자가 10개 이상 되도록 입력해주세요.");
			else
				break;
		}
		Random r = new Random();
		int randoms[] = new int[10];
		int count = 1;
		randoms[0] = r.nextInt(Math.abs(Z - A) + 1) + Math.min(A, Z);
		while (count < 10) {
			randoms[count] = r.nextInt(Math.abs(Z - A) + 1) + Math.min(A, Z);
			for (int i = 0; i < count; i++) {
				if (randoms[i] == randoms[count]) {
					count--;
					break;
				}
			}
			count++;
		}

		System.out.print("변수 " + Math.min(A, Z) + "부터 " + Math.max(A, Z) + " 사이의 난수 10개 생성 : ");
		for (int i : randoms)
			System.out.print(i + " ");
		System.out.print("\n");
	}
}
