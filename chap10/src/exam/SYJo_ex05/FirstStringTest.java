package exam.SYJo_ex05;

import java.util.Scanner;
import java.util.function.UnaryOperator;

class FirstString {
	String startsWith(String s) {
		return Character.toString(s.charAt(0));
	}
}

public class FirstStringTest {
	public static void main(String[] args) {
		String test;
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		test = sc.nextLine();
		UnaryOperator<String> o;
		FirstString fs = new FirstString();
		o = s -> fs.startsWith(s);
		System.out.println("문자열의 첫 문자 : " + o.apply(test));
	}
}
