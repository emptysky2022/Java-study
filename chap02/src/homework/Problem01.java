package homework;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		int input;
		Scanner in = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		input = in.nextInt();

		if (input >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
	}
}
