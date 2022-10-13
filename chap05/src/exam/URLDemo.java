package exam;

import java.util.Scanner;

public class URLDemo {
	public static void main(String[] args) {
		String s;
		String[] tmp;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("URL을 입력하세요 : ");
			s = in.nextLine();
			if (s.equals("bye"))
				break;
			tmp = s.split("\\.");
			for (String str : tmp) {
				if (str.equals("com"))
					System.out.println(s + "은 'com'으로 끝납니다");
				else if (str.equals("java"))
					System.out.println(s + "은 'java'를 포함합니다.");
			}
		}

	}
}
