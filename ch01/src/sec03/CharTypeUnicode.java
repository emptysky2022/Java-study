package sec03;

public class CharTypeUnicode {
	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';
		// 10진수로 유니코드 값 입력
		char ch3 = 54736;
		char ch4 = 54869;
		// 16진수로 유니코드 값 입력
		char ch5 = 0xD5D0;
		char ch6 = 0xD655;

		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		System.out.println((int) ch5 + " " + (int) ch6);

		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		// char c4 = "A"; 문자형에 문자열을 넣을수 없음

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}
