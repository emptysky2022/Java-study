package homework;

public class Problem09 {
	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	public static void foo(String str) {
		System.out.println(str);
	}

	public static void foo(String str, int i1) {
		System.out.println(str + " " + i1);
	}

	public static void foo(String str, int i1, int i2) {
		System.out.println(str + " " + i1 + " " + i2);
	}
}
