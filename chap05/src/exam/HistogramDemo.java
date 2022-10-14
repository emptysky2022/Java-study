package exam;

import java.util.Scanner;

public class HistogramDemo {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] count = new int[10];
		Scanner in = new Scanner(System.in);

		System.out.println("숫자를 10개 입력하세요.");

		for (int i = 0; i < 10; i++) {
			arr[i] = in.nextInt();
			if (arr[i] >= 0)
				count[arr[i] / 10]++;
		}
		for (int i = 0; i < 10; i++) {
			if (i == 0)
				System.out.printf("%2d ~ %2d : ", i, i + 9);
			else
				System.out.print(i + "0 ~ " + i + "9 : ");

			for (int j = 0; j < count[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
