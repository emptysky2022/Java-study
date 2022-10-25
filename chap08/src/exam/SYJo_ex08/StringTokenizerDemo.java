package exam.SYJo_ex08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		System.out.println("단어 개수 : " + st.countTokens());
		ArrayList<String> str = new ArrayList<>();
		while (st.hasMoreTokens())
			str.add(st.nextToken());
		Collections.sort(str);

		System.out.print("정렬된 토큰 : ");
		for (String s : str)
			System.out.print(s + ", ");

	}
}
