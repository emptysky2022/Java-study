package sec02;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2);

		String str3 = "hello";
		String str4 = "hello";

		System.out.println(str3 == str4);

		String str5 = new String("world");
		System.out.println(System.identityHashCode(str1));

		str1 = str1.concat(str5);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
