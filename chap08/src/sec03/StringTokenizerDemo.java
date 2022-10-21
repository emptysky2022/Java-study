package sec03;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		stringToToken(s, " ,");
		s = "PM:08:45";
		stringToToken(s, ":");
		s = "12 + 36 - 5 / 2 = 44";
		stringToToken(s, "+-/= ");
	}

	public static void stringToToken(String s, String separator) {
		StringTokenizer st = new StringTokenizer(s, separator);

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "] ");
		}
		System.out.println();
	}
}
