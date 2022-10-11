package sec01;

import java.util.Scanner;

public class EchoDemo {
	public static void main(String[] args) {
		echo("안녕!", 3);
		Scanner in = new Scanner(System.in);

		echo(in.nextLine(), in.nextInt());
	}

	public static void echo(String str, int i) {
		for (int j = 0; j < i; j++) {
			System.out.println(str);
		}
	}
}
