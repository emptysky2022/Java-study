package exam.SYJo_ex08;

import java.util.Scanner;

public class EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Echoer e = new Echoer() {

			@Override
			void echo() {
				String str;
				do {
					str = in.nextLine();
					System.out.println(str);
				} while (!str.equals("끝"));

			}
		};
		e.start();
		e.echo();
		e.stop();
	}
}
