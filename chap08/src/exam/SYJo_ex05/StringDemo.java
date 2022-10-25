package exam.SYJo_ex05;

public class StringDemo {
	public static void main(String[] args) {
		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//		show(new Date());
	}

	public static void show(CharSequence str) {
		System.out.println(str);
	}
}
